import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        if (arr.isEmpty()) {
            System.out.println("Your ArrayList is Empty");
        } else {
            System.out.println("Size = " + arr.size());
        }
    }

}
