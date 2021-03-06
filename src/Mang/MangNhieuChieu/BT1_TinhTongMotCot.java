package Mang.MangNhieuChieu;
import java.util.Scanner;
public class BT1_TinhTongMotCot {
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
        //Chọn cột và tính tổng
        System.out.print("Chọn cột cần tính tổng ");
        int chooseColum = sc.nextInt();
        int tong = 0;
        for (int i=0; i<row; i++){
            tong += array[i][chooseColum-1];
        }
        System.out.print("Tổng của cột đó là: "+tong);
    }
}