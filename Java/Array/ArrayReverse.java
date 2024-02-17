import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number "+ i);
            int a = sc.nextInt();
            arr1.add(a);
        }
        System.out.println("orignal Array " + arr1);

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = arr1.size()-1; i >= 0; i--) {
            int b = arr1.get(i);
            arr2.add(b);
        }
        System.out.println("Reversed Array " + arr2);

        sc.close();
    }
    
    
}
