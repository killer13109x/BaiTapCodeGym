package Mang.MangNhieuChieu;
import java.util.Scanner;
public class BT2_TimPhanTuMax {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int row,colum;
        boolean kiemTra;
        do {
            System.out.print("Nhập số hàng của mảng 2 chiều: ");
            row = sc.nextInt();
            System.out.print("Nhập số cột của mảng 2 chiều: ");
            colum = sc.nextInt();
            if (row<=0 || colum<=0){
                System.out.println("LỖI");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        int[][] array = new int[row][colum];
        //Nhập các phần tử của mảng 2 chiều
        for (int i=0; i<row; i++){
            System.out.print("Nhập các phần tử ở hàng thứ "+(i+1)+ " : ");
            for (int j=0; j<colum; j++){
                array[i][j] = sc.nextInt();
            }
        }
        //Tìm Max
        int max = array[0][0];
        int viTriHang=0, viTriCot=0;
        for (int hang=1; hang<array.length; hang++){
            for (int cot=1; cot<array[hang].length; cot++){
                if (max < array[hang][cot]){
                    max = array[hang][cot];
                    viTriCot = cot+1;
                    viTriHang = hang+1;
                }
            }
        }
        System.out.println("Max = "+max+", ở hàng thứ "+viTriHang+", cột thứ "+viTriCot);
    }
}