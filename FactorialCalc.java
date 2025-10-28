import java.util.Scanner;

public class FactorialCalc {
    public static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to be factorialized: ");
        int x = input.nextInt();
        int fact = 1;

        for(int i = 1; i <= x; i++){
            fact *= i;
        }

        System.out.print("The Factorial of " + x + " is " + fact);

        input.close();
    }
}
