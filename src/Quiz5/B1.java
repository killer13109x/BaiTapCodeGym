package Quiz5;

import java.util.Scanner;

public class B1 {
    String str;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dia chi IP: ");
        str = sc.next();
    }

    public boolean check() {
        String[] arrStr = str.split("\\.");
        if (arrStr.length != 4) return false;
        else {
            int[] ipTungPhan = new int[arrStr.length];
            int countFalsity = 0;
            for (int i = 0; i < arrStr.length; i++) {
                try {
                    ipTungPhan[i] = Integer.parseInt(arrStr[i]);
                } catch (Exception e) {
                    return false;
                }
                if (ipTungPhan[i] < 0 || ipTungPhan[i] > 255) return false;
            }
        return true;
        }
    }
}
