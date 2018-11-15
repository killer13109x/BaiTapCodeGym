package Quiz3;

import java.util.Arrays;
import java.util.Scanner;

public class B4 {
    int length;
    public String[] arr;

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Độ dài mỗi hàng: ");
            length = sc.nextInt();
        } while (length <= 0);
        arr = new String[length - 1];
        for (int i = 0; i < length - 1; i++) {
            System.out.print("Phần tử " + (i + 1) + "\t");
            arr[i] = sc.next();
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
    }
    public String[] addBorder(){
        String[] temp = new String[arr.length+2];
        String borderTopAndBot = "****";
        for (int i=1; i<=arr[0].length(); i++){
            borderTopAndBot += "*";
        }
        temp[0] = temp[temp.length-1] = borderTopAndBot;
        for (int i=1; i<=temp.length-2; i++){
            temp[i] = "**" + arr[i-1] + "**";
        }
        return temp;
    }
    public void display(String[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
