package Quiz4;

import java.util.Arrays;
import java.util.Scanner;

public class B2 {
    int size;
    int[] arr;

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Kích thước mảng chướng ngại vật: ");
            size = sc.nextInt();
        } while (size <= 0);
        arr = new int[size];
        System.out.println("Nhập lần lượt vị trí của chướng ngại vật (vị trí > 0) ");
        for (int i = 0; i < size; i++) {
            do {
                System.out.println("Phần tử "+ (i+1) + "\t");
                arr[i] = sc.nextInt();
            }while (arr[i] <= 0);
        }
    }

    public int findMinStep() {
        int minStep = 2;
        do {
            int count = 0;
            for (int value : arr) {
                if (value % minStep == 0) {
                    minStep++;
                    count++;
                    break;
                }
            }
            if (count == 0) break;
        } while (true);
        return minStep;
    }
}
