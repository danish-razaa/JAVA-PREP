import java.util.Scanner; 
public class FactorialWhileLoop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
        long factorial = 1;
        int i = 1;
        while(i <= num){
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
        sc.close();
    }
}