import java.util.Scanner;
import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();
        String[] searchArr = new String[n];
        for (int i = 0; i < searchArr.length; i++) {
            System.out.println("Enter " + (i + 1) + " Element");
            searchArr[i] = sc.next();
        }
        System.out.println("What do you want to search");
        String search = sc.next();
        boolean found = false;
        for (int i = 0; i < searchArr.length; i++) {
            if (searchArr[i].equalsIgnoreCase(search)) {
                System.out.println("Match Found for \"" + search + "\" At index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry no result found");
        }
        System.out.println();
        System.out.println(Arrays.toString(searchArr));
        sc.close();
    }

}
