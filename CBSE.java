import java.util.Scanner;
public class CBSE{
    public static void main(String[] args) {
        int Subject1, Subject2, Subject3, Subject4, Subject5,TotalMarks;
        float Percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        Subject1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        Subject2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        Subject3 = sc.nextInt();
        System.out.print("Enter marks for Subject 4: ");               
        Subject4 = sc.nextInt();
        System.out.print("Enter marks for Subject 5: ");
        Subject5 = sc.nextInt();
        TotalMarks = Subject1 + Subject2 + Subject3 + Subject4 + Subject5;
        Percentage = (TotalMarks / 5);
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Percentage: " + Percentage + "%");

    }
}