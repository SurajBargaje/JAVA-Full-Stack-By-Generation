import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] arr = { "Jay", "Shree", "Ram" };
        String[] arr1 = new String[3];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
