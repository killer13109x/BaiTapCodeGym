package PhuongThuc.Buoi1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TongCacChuSo {
    public static void main(String[] args) {
        String n;
        long tong = 0;
        n = nhap();
        tong = tinhTong(n);
        System.out.println(tong);
    }

    public static String nhap() {
        String n;
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print("Nhập n: ");
            n = sc.next();
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(n);
            if (matcher.matches()) {
                return n;
            } else System.out.println("LỖI. VUI LÒNG NHẬP LẠI!");
        } while (check);
        return n;
    }

    public static long tinhTong(String n) {
        int tong = 0;
        int doDai = n.length();
        for (int i = 1; i<=doDai; i++){
            tong += Integer.parseInt(n.substring(i-1,i));
        }
        return tong;
    }
}