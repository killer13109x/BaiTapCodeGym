package PhuongThuc.Buoi1;

import javafx.css.Match;

import java.util.Scanner;

public class HienThiMaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập kích thước ma trận: n = ");
            n = sc.nextInt();
            if (n > 0) {
                break;
            } else System.out.println("ko hợp lệ");
        } while (true);
        hienThiMatrix(n);
    }

    public static void hienThiMatrix(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 10) % 2;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}