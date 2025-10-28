import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("The number is an even number");
        } else {
            System.out.println("The number is an odd number");
        }
        input.close();
    }

}
