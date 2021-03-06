package Mang.MangMotChieu;
import java.util.Arrays;
import java.util.Scanner;
public class BT_ThemvaXoaPhanTuMang {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int kichThuoc;
        boolean kiemTra;
        //Nhập mảng
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            kichThuoc = sc.nextInt();
            if (kichThuoc<=0){
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        String[] arr = new String[kichThuoc];
        System.out.print("Nhap lan luot cac phan tu trong mang: ");
        nhapMang(arr);
        //In ra mảng vừa nhập
        System.out.println(Arrays.toString(arr));
        //Hiển thị Menu
        System.out.println("Menu");
        System.out.println("\t1. Thêm phần tử");
        System.out.println("\t2. Xóa phần tử");
        int chon = sc.nextInt();

        String[] arrNew;
        switch (chon){
            case 1:
                boolean yesOrNo;
                do {
                    kichThuoc = kichThuoc + 1;
                    arrNew = new String[kichThuoc];
                    for (int i = 0; i < arrNew.length - 1; i++) {
                        arrNew[i] = arr[i];
                    }
                    System.out.print("Nhập phần từ muốn thêm: ");
                    arrNew[arrNew.length - 1] = sc.next();
                    System.out.println(Arrays.toString(arrNew));
                    arr = arrNew;
                    arrNew = null;
                    System.out.print("Bạn còn muốn thêm ko? Yes or No \t");
                    String tiepTuc = sc.next();
                    if (tiepTuc.equals("yes")){
                        yesOrNo = true;
                    }else yesOrNo = false;
                }while (yesOrNo);
                break;
            case 2:
                String bienCanXoa;
                boolean yesOrNo2;
                boolean ktSoCanXoa = true;
                do {
                    do {
                        System.out.print("Nhập giá trị cần xóa ");
                        bienCanXoa = sc.next();
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i].equals(bienCanXoa)) {
                                ktSoCanXoa = false;
                            }
                        }
                        if (ktSoCanXoa == true) {
                            System.out.println("Không tồn tại số " + bienCanXoa + " trong mảng. Vui lòng nhập lại");
                        }
                    } while (ktSoCanXoa);
                    kichThuoc = kichThuoc - 1;
                    arrNew = new String[kichThuoc];
                    int j =0;
                    for (int i=0; i<arrNew.length; i++){
                        if (bienCanXoa.equals(arr[i])){
                            j++;
                            arrNew[i] = arr[j];
                        }else {
                            arrNew[i]=arr[j];
                        }
                        j++;
                    }
                    System.out.println(Arrays.toString(arrNew));
                    arr = arrNew;
                    arrNew = null;
                    System.out.print("Bạn còn muốn thêm ko? Yes or No \t");
                    String tiepTuc2 = sc.next();
                    if (tiepTuc2.equals("yes")){
                        yesOrNo2 = true;
                    }else yesOrNo2 = false;
                }while (yesOrNo2);
                break;
            default:
                System.out.println("Chỉ chọn 1 hoặc 2!!!");
                break;
        }
    }
    public static void nhapMang(String[] mang){
        for (int i=0; i<mang.length; i++){
            mang[i] = sc.next();
        }
    }

}