import java.util.Scanner;
import java.util.Random;
  public class Rock{
    public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Enter Your Choice");
    System.out.println("1.Stone");
    System.out.println("2.Paper");
    System.out.println("3.Scissor");
    int user = sc.nextInt();
    int Computer = random.nextInt(3) + 1;
    System.out.println("computer Chooses" + Computer);
    if (user == Computer){
        System.out.println("Round Draws");
    }
    else if((user == 1 && Computer == 3) ||
           (user == 2 && Computer == 1) ||
           (user == 3 && Computer == 2)){
            System.out.println("User Wins");
           }
    else{
        System.out.println("Computer Wins");
    } 
    sc.close();      
  }
  }  