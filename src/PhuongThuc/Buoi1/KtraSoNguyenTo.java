package PhuongThuc.Buoi1;

import java.util.Scanner;

public class KtraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = nhap();
        if (ktraSoNguyenTo(n) == true) {
            System.out.println(n + " là số nguyên tố");
        } else System.out.println(n + " ko phải số nguyên tố");
        in10000SNT();
    }

    public static int nhap() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số muốn kiểm tra n = ");
            n = sc.nextInt();
            if (n > 0) {
                return n;
            } else System.out.println("ko hợp lệ");
        } while (true);
    }

    public static boolean ktraSoNguyenTo(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void in10000SNT(){
        for (int i = 1; i <= 10000; i++) {
            if (ktraSoNguyenTo(i) == true) {
                System.out.print(i + "\t");
            }
        }
    }
}