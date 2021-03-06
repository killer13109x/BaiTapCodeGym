package Mang.MangNhieuChieu;
import java.util.Scanner;
public class BT5_ChoiCaro {
    static Scanner sc = new Scanner(System.in);
    //không nên khai báo static 
    public static void main(String[] args) {
        int rowCaroMax, colCaroMax;
        boolean kiemTra;
        //Nhập kích thước bàn cờ
        do {
            System.out.print("Nhập kích thước bàn cờ caro tương ứng: hàng x cột: ");
            rowCaroMax = sc.nextInt();
            colCaroMax = sc.nextInt();
            if (rowCaroMax <5 || colCaroMax <5) {
                kiemTra = true;
            } else kiemTra = false;
        } while (kiemTra);
        //Khởi tạo mảng 2 chiều toàn kí tự trống và vẽ
        int rowArray = 2 * rowCaroMax + 1, colArray = 2 * colCaroMax + 1;
        char[][] array = new char[rowArray][colArray];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
            }
        }
        veBanCo(array);

        //Vòng lặp chơi game
        while (true) {
            //player1 đánh
            boolean playerX;
            int rowX, colX;
            int rowCvtArray, colCvtArray;
            do {
                System.out.print("Chọn vị trí X: (hàng,cột) = ");
                rowX = sc.nextInt();
                rowCvtArray = 1 + 2 * (rowX - 1);
                colX = sc.nextInt();
                colCvtArray = 1 + 2 * (colX - 1);
                if (colX <= 0 || rowX <= 0 || rowX > rowCaroMax || colX > colCaroMax || array[rowCvtArray][colCvtArray] != ' ') {
                    System.out.println("Nhập lại!!!");
                    playerX = true;
                } else {
                    playerX = false;
                }
            } while (playerX);
            array[rowCvtArray][colCvtArray] = 'X';
            veBanCo(array);
            if (kiemTraWin(array,rowArray,colArray,'X')){
                System.out.println("X wins the game!");
                break;
            }
            //player2 đánh
            boolean playerY;
            int rowY, colY;
            int rowCvtArray2, colCvtArray2;
            do {
                System.out.print("Chọn vị trí O: (hàng,cột) = ");
                rowY = sc.nextInt();
                rowCvtArray2 = 1 + 2 * (rowY - 1);
                colY = sc.nextInt();
                colCvtArray2 = 1 + 2 * (colY - 1);
                if (colY <= 0 || rowY <= 0 || rowY > rowCaroMax || colY > colCaroMax || array[rowCvtArray2][colCvtArray2] != ' ') {
                    System.out.println("Nhập lại!!!");
                    playerY = true;
                } else {
                    playerY = false;
                }
            } while (playerX);
            array[rowCvtArray2][colCvtArray2] = 'O';
            veBanCo(array);
            if (kiemTraWin(array,rowArray,colArray,'O')){
                System.out.println("Y wins the game!");
                break;
            }

        }

    }

    public static void veBanCo(char[][] mang) {
        int n=0, m=1;
        for (int hang = 0; hang < mang.length; hang++) {
            if (hang % 2 == 0) {
                for (int cot = 0; cot < mang[hang].length; cot++) {
                    mang[hang][cot] = '-';
                    System.out.print(mang[hang][cot] + " ");
                }
                System.out.println();
            } else {
                for (int cot = 0; cot < mang[hang].length; cot++) {
                    if (cot % 2 == 0) {
                        mang[hang][cot] = '|';
                        System.out.print(mang[hang][cot] + " ");
                    } else {
                        System.out.print(mang[hang][cot] + " ");
                    }
                }
                //vẽ chỉ số hàng
                n++;
                System.out.println(" "+n);
            }
        }
        //vẽ chỉ số cột
        for (int i=0; i<mang[mang.length-1].length; i++){
            if (i%2!=0){
                if (m/10==0) {
                    System.out.print(" " + m + " ");
                    m++;
                }else {
                    System.out.print(" "+m);
                    m++;
                }
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static boolean kiemTraWin(char[][] mang, int row, int col, char a) {
        boolean result = false;
        for (int i = 1; i < row; i = i + 2) {
            for (int j = 1; j < col - 9; j = j + 2) {
                if (mang[i][j]==a && mang[i][j + 2]==a && mang[i][j + 4]==a && mang[i][j + 6]==a && mang[i][j+8]==a){
                    result = true;
                    return result;
                }
            }
        }
        for (int j=1; j<col; j=j+2){
            for (int i=1; i<row-9; i=i+2){
                if (mang[i][j]==a && mang[i+2][j]==a && mang[i+4][j]==a && mang[i+6][j]==a && mang[i+8][j]==a){
                    result =true;
                    return result;
                }
            }
        }
        return result;
    }
}
