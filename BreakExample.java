public class BreakExample {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}