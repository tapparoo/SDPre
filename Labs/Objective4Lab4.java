import java.util.Scanner;

public class Objective4Lab4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even.");
        else
            System.out.println(num + " is odd.");

        scanner.close();
    }
}