import java.util.Scanner;
public class Switchclass{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a day:");
     int day = sc.nextInt();
     switch(day){
        case 1 :
            System.out.println("Day is Monday");
            break;
        case 2 :
            System.out.println("day is tuesday");
        case 3 :
            System.out.println("Day is Wednesday");
            break;
            default :
            System.out.println("invalind");    
     }   
         
    }
} 