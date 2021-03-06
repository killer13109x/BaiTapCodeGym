package CauLenhLap.BT3_HienThiCacLoaiHinh;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ktContinue;
        int choice;
        do {
            Menu();
            choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid Choice");
                ktContinue = true;
            }else ktContinue = false;
        }while (ktContinue);
        switch (choice){
            case 1:
                rectangle();
                break;
            case 2:
                System.out.println("\t2.Print the square triangle");
                System.out.println("\t\t1.Bottom_Left");
                System.out.println("\t\t2.Bottom_Right");
                System.out.println("\t\t3.Top_Left");
                System.out.println("\t\t4.Top_Right");
                int choice2 = input.nextInt();
                switch (choice2){
                    case 1:
                        triangleBottomLeft();
                        break;
                    case 2:
                        triangleBottomRight();
                        break;
                    case 3:
                        triangleTopLeft();
                        break;
                    case 4:
                        triangleTopRight();
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;

                }
                break;
            case 3:
                isoscelesTriangle();
                break;
            case 4:
                break;
        }
    }
    public static void Menu(){
        System.out.println("Menu");
        System.out.println("\t1.Print the rectangle");
        System.out.println("\t2.Print the square triangle");
        System.out.println("\t3.Print isosceles triangle");
        System.out.println("\t4.Exit!");
        System.out.println("Your choice???");
    }
    public static void rectangle(){
        Scanner sc = new Scanner(System.in);
        boolean kiemTra;
        int dai,rong;
        do {
            System.out.println("Nhap chieu dai: ");
            dai = sc.nextInt();
            System.out.println("Nhap chieu rong: ");
            rong = sc.nextInt();
            if (dai<=rong || dai<0 || rong<0){
                System.out.println("ERROR!");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        for (int i=1; i<=rong; i++){
            for (int j=1; j<=dai; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void triangleBottomLeft(){
        Scanner sc = new Scanner(System.in);
        int canh;
        boolean kiemTra;
        do {
            System.out.println("Do dai canh tam giac: ");
            canh = sc.nextInt();
            if (canh<=0){
                System.out.println("ERROR!");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        for (int hang=1; hang<=canh; hang++){
            for (int dauSao=1; dauSao<=hang; dauSao++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangleBottomRight(){
        Scanner sc = new Scanner(System.in);
        int canh;
        boolean kiemTra;
        do {
            System.out.println("Do dai canh tam giac: ");
            canh = sc.nextInt();
            if (canh<=0){
                System.out.println("ERROR!");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        for (int hang=1; hang<=canh; hang++){
            for (int khoangTrang=canh; khoangTrang>hang; khoangTrang--){
                System.out.print("  ");
            }
            for (int dauSao=1; dauSao<=hang; dauSao++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangleTopLeft(){
        Scanner sc = new Scanner(System.in);
        int canh;
        boolean kiemTra;
        do {
            System.out.println("Do dai canh tam giac: ");
            canh = sc.nextInt();
            if (canh<=0){
                System.out.println("ERROR!");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        for (int hang=canh; hang>0; hang--){
            for (int dauSao=hang; dauSao>0; dauSao--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangleTopRight(){
        Scanner sc = new Scanner(System.in);
        int canh;
        boolean kiemTra;
        do {
            System.out.println("Do dai canh tam giac: ");
            canh = sc.nextInt();
            if (canh<=0){
                System.out.println("ERROR!");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        for (int i=canh; i>0; i--){
            for (int khoangTrang=canh-i; khoangTrang>0; khoangTrang--){
                System.out.print("  ");
            }
            for (int dauSao=i; dauSao>0; dauSao--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void isoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        int canh;
        boolean kiemTra;
        do {
            System.out.println("Do dai canh tam giac: ");
            canh = sc.nextInt();
            if (canh<=0){
                System.out.println("ERROR!");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        int tongCot = canh*2 - 1;
        for (int hang=1; hang<=canh; hang++){
            int tongDauSao = hang*2-1;
            int khoangTrang = tongCot - tongDauSao;
            for(int cotTrai=1; cotTrai<=(khoangTrang/2); cotTrai++){
                System.out.print("  ");
            }
            for (int dauSao=1; dauSao<=tongDauSao; dauSao++){
                System.out.print("* ");
            }
            for (int cotPhai=1; cotPhai<=(khoangTrang/2); cotPhai++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}