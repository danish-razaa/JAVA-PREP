import java.util.Scanner;
public class check{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer");
        int n = sc.nextInt();
        boolean isInt= sc.hasNextInt();
        System.out.println("is integer:" + isInt);
    }
}