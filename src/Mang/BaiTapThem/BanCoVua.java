package Mang.BaiTapThem;
import java.util.Arrays;
import java.util.Scanner;
public class BanCoVua {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        ganGtriArr(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.print("Nhập vị trí của quân xe: (hàng,cột) = ");
        Scanner sc = new Scanner(System.in);
        int row, col;
        String chuoi = sc.next();

        row = Integer.parseInt(chuoi.substring(0,1));
        col = chuoi.charAt(1) - 96;
        timDuongDi(row, col, arr);
    }

    public static void ganGtriArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            char chuCai = 'a';
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = String.valueOf(i + 1) + chuCai;
                chuCai++;
            }
        }
    }

    public static void timDuongDi(int row, int col, String[][] arr) {
        System.out.print("đi theo hàng ngang: \t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][col - 1] + "\t");
        }
        System.out.println();
        System.out.print("đi theo hàng dọc: \t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[row - 1][i] + "\t");
        }
    }
}