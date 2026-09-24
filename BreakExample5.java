public class BreakExample5 {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 30, 45, 50, 60};
        int target = 45;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                System.out.println("Number found at index: " + i);
                break;
            }
        }
    }
}
