import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println(num1 + " added to "+ num2+ " is "+ (num1+num2));

        input.close();


    }

}