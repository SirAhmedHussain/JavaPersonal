import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args){

        int x = 6;
        Scanner input = new Scanner(System.in);

        System.out.print("Guess the correct number: ");
        int guess = input.nextInt();

        while(x != guess){
            if(x < guess){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too low");
            }
            System.out.print("Try again: ");
            guess = input.nextInt();
        }

        System.out.println("Haave you played this before? CAUSE CONGRATS YOU WON");

        input.close();

    }
    
}
