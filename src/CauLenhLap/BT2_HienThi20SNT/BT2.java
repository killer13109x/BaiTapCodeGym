package CauLenhLap.BT2_HienThi20SNT;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int numbers;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("So luong SNT can in la: ");
            numbers = sc.nextInt();
            if (numbers < 0) {
                System.out.println("Invalid Number");
            }
        } while (numbers < 0);
        int count = 0;
        int N = 2;
        while (count<numbers){
            if (test(N)){
                System.out.println(N);
                count++;
            }
            N++;
        }

    }

    public static boolean test(int x) {
        int uoc = 0;
        for (int j = 2; j <= Math.sqrt(x); j++) {
            if (x % j == 0) {
                uoc++;
                break;
            }
        }
        if (uoc == 0) {
            return true;
        }else return false;
    }
}