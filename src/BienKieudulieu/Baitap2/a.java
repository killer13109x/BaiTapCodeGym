package BienKieudulieu.Baitap2;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        final int tigia = 23000;      // VND/USD
        int usd, vnd;
        label:
        while (true) {
            System.out.println("Nhập số tiền muốn chuyển đổi: ");
            Scanner sc = new Scanner(System.in);
            usd = sc.nextInt();
            if (usd<0){
                System.out.println("Không hợp lệ!!!");
                continue label;
            }else {
                vnd = usd*tigia;
                System.out.println(vnd +" VND");
                break label;
            }
        }
    }
}

