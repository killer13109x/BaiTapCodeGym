package BienKieudulieu.Baitap1;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        short namSinh, namHienTai, tuoi;
        Scanner sc = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("Nhập năm sinh: ");
            namSinh = sc.nextShort();
            System.out.println("Nhập năm hiện tại: ");
            namHienTai = sc.nextShort();
            if (namSinh<=0 || namHienTai<=0 || namSinh>=namHienTai){
                System.out.println("Không hợp lệ!!!");
                continue label;
            }else{
                tuoi = (short) (namHienTai - namSinh);
                System.out.println("Tuổi: "+tuoi);
                break label;
            }
        }
    }
}