package Quiz3;

import java.util.Scanner;

public class B1 {
    public int size;
    public int[][] arr;

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Kích thước mảng: ");
            size = sc.nextInt();
        } while (size <= 0);
        arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hàng thứ " + (i + 1));
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public int[][] xoay(){
        int[][] temp = new int[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                temp[i][j] = arr[size-1-j][i];
            }
        }
        return temp;
    }
}
