package PhuongThuc.Buoi1.BaiTapThem;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        int[][] arr = nhap();
        System.out.println(tinhTien(arr));
    }

    public static int[][] nhap() {
        Scanner sc = new Scanner(System.in);
        int row, col;
        do {
            System.out.print("Kích thước ma trận: (hàng,cột) = ");
            row = sc.nextInt();
            col = sc.nextInt();
            if (col > 0 && row > 0) {
                break;
            } else System.out.println("Lỗi. Nhập lại!!!");
        } while (true);
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.print("Hàng thứ " + (i + 1) + " : ");
            for (int j = 0; j < col; j++) {
                do {
                    matrix[i][j] = sc.nextInt();
                    if (matrix[i][j] >= 0) {
                        break;
                    } else System.out.println("LỖI");
                } while (true);
            }
        }
        return matrix;
    }

    public static int tinhTien(int[][] mang) {
        int tien = 0;
        for (int j = 0; j < mang[0].length; j++) {
            for (int i = 0; i < mang.length; i++) {
                if (mang[i][j]==0){
                    break;
                }else tien += mang[i][j];
            }
        }
        return tien;
    }
}