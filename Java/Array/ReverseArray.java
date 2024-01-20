import java.util.Scanner;
import java.util.Arrays;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[4];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter Element " + i);
            number[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(number));

        int[] reverse = new int[number.length];
        int count =0;
        for (int i = number.length - 1; i >= 0; i--) {
            reverse[count] = number[i];
            count++;
            // System.out.println();
        }

        System.out.println("Reversed Array: " + Arrays.toString(reverse));
        sc.close();
    }
}
