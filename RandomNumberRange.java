import java.util.Random;
import java.util.Scanner;

public class RandomNumberRange{
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Input the starting number of the range: ");
        int x = input.nextInt();
        System.out.println("");

        System.out.print("Input the ending number of the range: ");
        int y = input.nextInt();
        System.out.println("");

        int RandNum = x + (int)( Math.random() * ((y-x)+1));

        System.out.println("Random Number: "+ RandNum);


        input.close();
    }
}