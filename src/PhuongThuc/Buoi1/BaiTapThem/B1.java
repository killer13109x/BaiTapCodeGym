package PhuongThuc.Buoi1.BaiTapThem;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.next();
        String strNguoc = daoNguoc(str);
        if (str.equals(strNguoc)){
            System.out.println(str + " là chuỗi đối xứng");
        }else  System.out.println(str + " ko phải chuỗi đối xứng");
    }
    public static String daoNguoc(String x){
        String strNguoc = "";
        char[] arr = x.toCharArray();
        for (int i = arr.length - 1; i>=0; i--){
            strNguoc += arr[i];
        }
        return strNguoc;
    }
}