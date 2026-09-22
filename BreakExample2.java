public class BreakExample2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                break;
            }

            System.out.println(i);
        }
    }
}