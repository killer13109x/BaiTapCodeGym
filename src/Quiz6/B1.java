package Quiz6;

import java.util.Scanner;

public class B1 {
    String str;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        str = sc.nextLine();
    }
    public String alphabeShift(){
        String result = "";
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'z'){
                result += "a";
            }else {
                result += (char) (str.charAt(i) + 1);
            }

        }
        return result;
    }
}
