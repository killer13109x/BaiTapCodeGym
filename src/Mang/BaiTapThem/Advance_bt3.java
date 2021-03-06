package Mang.BaiTapThem;
import java.util.Arrays;
import java.util.Scanner;

public class Advance_bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kichThuoc;
        do {
            System.out.print("nhập kích thước mảng : ");
            kichThuoc = sc.nextInt();
            if (kichThuoc > 0) {
                break;
            } else System.out.println("LỖI");
        } while (true);
        int[] mang = nhapMang(kichThuoc);
        int ketQua = kiemTra(mang);
        System.out.println(ketQua);
//        System.out.println(Arrays.toString(mang));
    }

    public static int[] nhapMang(int kichThuoc) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[kichThuoc];
        for (int i = 0; i < kichThuoc; i++) {
            System.out.print("Phần tử thứ " + i + " ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int kiemTra(int[] arr) {
        int index = arr.length;
        int ketQua = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && index > j) {
                    ketQua = arr[j];
                    index = j;
                }
            }
        }
        return ketQua;
    }
}
