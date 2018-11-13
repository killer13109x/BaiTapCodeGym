package Quiz1;

import java.util.Scanner;

public class B1 {
    private static int n;
    public B1() {

    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
            String nToString = String.valueOf(n);
            if (nToString.length() % 2 == 0 && n > 0) break;
            else System.out.println("Ko hợp lệ! Kiểm tra lại!");
        } while (true);
    }

    public boolean check() {
        String str = String.valueOf(n);
        int mid = str.length() / 2;
        int tong1 = 0, tong2 = 0;
        for (int i = 0; i < mid; i++) {
            tong1 += Integer.parseInt(str.substring(i, (i + 1)));
        }
        for (int i = mid; i < str.length(); i++) {
            tong2 += Integer.parseInt(str.substring(i, (i + 1)));
        }

        if (tong1 == tong2) return true;
        else return false;
    }
}
