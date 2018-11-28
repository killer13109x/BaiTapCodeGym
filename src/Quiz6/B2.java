package Quiz6;

import java.util.Scanner;

public class B2 {
    String str;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();
    }

    public String properNounCorrection() {
        String temp = str.toLowerCase();
        String result = "" + (char)(temp.charAt(0) - 32);
        for (int i = 1; i < str.length(); i++) {
            if (temp.charAt(i - 1) == ' ') {
                result += (char) (temp.charAt(i) - 32);
            } else {
                result += temp.charAt(i);
            }
        }
        return result.trim();
    }
}
