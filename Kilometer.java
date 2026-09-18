import java.util.Scanner;
public class Kilometer{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter kilometer:");
        float km = sc.nextFloat();
        float meter = km*1000f;
        System.out.println("Meter is: " + meter); 
    }
}