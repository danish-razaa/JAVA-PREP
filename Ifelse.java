import java.util.Scanner;
public class Ifelse{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Age:");
    int Age = sc.nextInt();
    if(Age>=18){
        System.out.println("You are allowed to vote");
    }
    else{
        System.out.println("You are not allowed to vote");
    }
    
}
}