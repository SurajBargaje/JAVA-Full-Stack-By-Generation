public class ThirdPattern {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5 - row; col++) {
                System.out.print("*");

            }

            System.out.println();

        }
    }

}
