package PhuongThuc.Buoi1;

import javafx.css.Match;

import java.util.Scanner;

public class TinhDienTichTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        do {
            System.out.print("Nhập lần lượt 3 cạnh của tam giác: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a > 0 || b > 0 || c > 0) {
                if (kiemTra(a, b, c)) {
                    break;
                } else System.out.println("Lỗi");
            } else System.out.println("Lỗi");
        } while (true);
        double trungBinh = (double) (a + b + c) / 2;
        double dienTich = Math.sqrt(trungBinh * (trungBinh - a) * (trungBinh - b) * (trungBinh - c));
        System.out.println(dienTich);
    }

    public static boolean kiemTra(int x, int y, int z) {
        if ((x + y) <= z || (x + z) <= y || (y + z) <= x) {
            return false;
        } else return true;
    }
}