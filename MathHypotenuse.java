import java.util.Scanner;

public class MathHypotenuse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        // value of one leg
        System.out.print("Enter A: ");
        double a = input.nextDouble();
        a = Math.pow(a,2);
        System.out.println("");

        //value of second leg
        System.out.print("Enter B: ");
        double b = input.nextDouble();
        b = Math.pow(b,2);
        System.out.println("");

        double total = a + b;
        double hypotenuse = Math.sqrt(total);

        System.out.print("The Hypoteuse of this triangle is: "+ hypotenuse);
        System.out.println(" ");

        
        input.close();
    }
}