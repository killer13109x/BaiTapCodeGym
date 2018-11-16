package Quiz4;

import java.util.Scanner;

public class B1 {
    int size;
    int[] arr;

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng: ");
            size = sc.nextInt();
        } while (size <= 1);
        arr = new int[size];
        System.out.println("Nhập lần lượt các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int tinhMaximum() {
        int max = 0;
        for (int i = 0; i < size - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) > max) {
                max = Math.abs(arr[i] - arr[i + 1]);
            }
        }
        return max;
    }
}
