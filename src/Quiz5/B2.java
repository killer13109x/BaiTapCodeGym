package Quiz5;

import java.util.Arrays;
import java.util.Scanner;

public class B2 {
    int[] arr;
    int size, elemToReplace, substitutionElem;

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Size of array: ");
            size = sc.nextInt();
        } while (size <= 0);
        arr = new int[size];
        System.out.println("Input elements of array in turn: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }
    public void inputElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Element to replace: ");
        elemToReplace = sc.nextInt();
        System.out.print("Replace it with element: ");
        substitutionElem = sc.nextInt();
    }
    public void replaceElement(){
        int count = 0;
        for (int i=0; i<size; i++) {
            if (arr[i] == elemToReplace){
                arr[i] = substitutionElem;
                count++;
            }
        }
        if (count == 0) System.out.println("Find no element \"" + elemToReplace +"\" to replace");
        else {
            System.out.println("Array after replaced" + Arrays.toString(arr));
        }
    }
}
