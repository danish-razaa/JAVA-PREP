import java.util.Scanner;
public class SUM{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to calculate their sum: ");
         int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = (a + b + c);
            System.out.println("Sum of three numbers is: " + sum);
    }
}