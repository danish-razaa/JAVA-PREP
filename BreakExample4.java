public class BreakExample4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i % 7 == 0) {
                System.out.println("First number divisible by 7: " + i);
                break;
            }
        }
    }
}