import java.util.Arrays;
import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();
        double[] avgArr = new double[n];
        for (int i = 0; i < avgArr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Element");
            avgArr[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (double i : avgArr) {
            sum += i;
        }
        double avg = sum / avgArr.length;

        System.out.println(Arrays.toString(avgArr));
        System.out.print("Avarage is : ");
        System.out.println(avg);
        sc.close();
    }

}
