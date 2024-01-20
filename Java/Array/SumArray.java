import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();
        int[] sum = new int[n];
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Enter " + (i + 1) + " Element");
            sum[i] = sc.nextInt();

        }
        int add = 0;
        for (int i = 0; i < sum.length; i++) {
            add += sum[i];
        }
        System.out.print("Array ");
        System.out.println(Arrays.toString(sum));
        System.out.println("Sum of elements of array = " + add);
        sc.close();
    }

}
