import java.util.Scanner;
public class Tax{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income Lakhs:");
        float Income = sc.nextFloat();
        if (Income >= 2.5 && Income <= 5.0){
            System.out.println("Your Tax is 5%");
        } 
        else if (Income >= 5.0 && Income <= 10.0){
            System.out.println("Your Tax is 20%");

        }
        else if (Income > 10.0){
            System.out.println("Your Tax is 30%");

        }
        else{
             System.out.println("You are Not under Tax Bracket");
        }
    }
}