import java.util.Scanner;
public  class Comparision {
    public static void main(String[] args ){
        int a = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }



    }
}