package Quiz2;

import java.util.Scanner;

public class B2 {
    private int[] arr;

    public B2() {
    }

    public void input() {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng: ");
            size = sc.nextInt();
        } while (size <= 0);
        arr = new int[size];
        System.out.println("Nhập lần lượt từng phần tử mảng");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public boolean check() {
        int cout = 0, temp = 0;
        for (int k=1; k<arr.length-1; k++){
            if (arr[k] >= arr[k+1]) temp++;
        }
        if (temp==0) return true;
        else {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] >= arr[j]) {
                        cout++;
                    }
                }
            }
            if (cout > 1) return false;
            else return true;
        }
    }
}
