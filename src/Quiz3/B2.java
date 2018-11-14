package Quiz3;

import java.util.Scanner;

public class B2 {
    int[] arrCanNang;
    int canNangTeam1 = 0, canNangTeam2 = 0;

    public void input() {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Số người: ");
            size = sc.nextInt();
        } while (size <= 0);
        arrCanNang = new int[size];
        System.out.print("Nhập mảng cân nặng: ");
        for (int i = 0; i < size; i++) {
            do {
                arrCanNang[i] = sc.nextInt();
            } while (arrCanNang[i] <= 0);
        }
    }

    public int[] tinhCanNang() {
        for (int i = 0; i < arrCanNang.length; i++) {
            if (i % 2 == 0) {
                canNangTeam1 += arrCanNang[i];
            }else canNangTeam2 += arrCanNang[i];
        }
        int[] temp = {canNangTeam1, canNangTeam2};
        return temp;
    }
}
