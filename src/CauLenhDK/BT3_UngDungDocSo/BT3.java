package CauLenhDK.BT3_UngDungDocSo;
import java.util.Scanner;
public class BT3{
    public static void main(String[] args) {
        System.out.print("Nhap so can doc: ");
        Scanner sc = new Scanner(System.in);
        int soCanDoc = sc.nextInt();
        if (soCanDoc<0 || soCanDoc>999){
            System.out.print("LỖI!!!");
        }else {
            if (soCanDoc<20){
                Duoi20(soCanDoc);
            }else {
                if (soCanDoc<100){
                    int soHangChuc = soCanDoc/10;
                    int soDonVi = soCanDoc%10;
                    HangChuc(soHangChuc);
                    Duoi20(soDonVi);
                }else {
                    int soHangTram = soCanDoc/100;
                    int soHangChucVaDonVi = soCanDoc - soHangTram*100;
                    if (soHangChucVaDonVi==0){
                        Duoi20(soHangTram);
                        System.out.print("hundred");
                    }else {
                        int soHangChuc = soHangChucVaDonVi/10;
                        int soDonVi = soHangChucVaDonVi%10;
                        if (soHangChucVaDonVi<20){
                            Duoi20(soHangTram);
                            System.out.print("hundred and ");
                            Duoi20(soHangChucVaDonVi);
                        }else {
                            Duoi20(soHangTram);
                            System.out.print("hundred and ");
                            HangChuc(soHangChuc);
                            Duoi20(soDonVi);
                        }
                    }
                }
            }
        }
    }
    public static void Duoi20(int x){
        switch (x){
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
            case 10:
                System.out.print("ten ");
                break;
            case 11:
                System.out.print("eleven ");
                break;
            case 12:
                System.out.print("twelve ");
                break;
            case 13:
                System.out.print("thirteen ");
                break;
            case 14:
                System.out.print("fourteen ");
                break;
            case 15:
                System.out.print("fifteen ");
                break;
            case 16:
                System.out.print("sixteen ");
                break;
            case 17:
                System.out.print("seventeen ");
                break;
            case 18:
                System.out.print("eighteen ");
                break;
            case 19:
                System.out.print("nineteen ");
                break;
        }
    }
    public static void HangChuc(int x){
        switch (x){
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
    }
}