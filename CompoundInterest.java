import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Principal amount: ");
        double p = input.nextInt();
        System.out.println("");

        System.out.print("Enter the interest rate (in %): ");
        double r = input.nextInt();
        r = r/100;
        System.out.println("");

        System.out.print("Enter the # of times compounded per year: ");
        int n = input.nextInt();
        System.out.println("");

        System.out.print("Enter the # of years: ");
        int t = input.nextInt();
        System.out.println("");

        double A;

        A =  p * Math.pow((1 + r/n),n*t);

        System.out.printf("The amount after 1 years is $%.2f", A);

        input.close();
    }
}
