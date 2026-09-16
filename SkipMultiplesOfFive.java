public class SkipMultiplesOfFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                continue; // Skip multiples of 5
            }
            System.out.println(i);
        }
    }
}