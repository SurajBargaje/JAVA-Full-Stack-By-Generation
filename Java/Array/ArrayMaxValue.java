import java.util.Scanner;
import java.util.Arrays;

public class ArrayMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();
        int[] maxArr = new int[n];
        for (int i = 0; i < maxArr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Element");
            maxArr[i] = sc.nextInt();
        }
        int max = maxArr[0];
        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] > max) {
                max = maxArr[i];
            }
        }
        System.out.println("Array " + Arrays.toString(maxArr));
        System.out.println("Maxium Number : " + max);
        sc.close();
    }
}
