import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("I will preform complex mathmatical process for you, but first give me a number: ");
        int x = input.nextInt();
        int sum = 0;

        while (x > 0){
            sum += x;
            x -= 1;
        }

        System.out.println(sum);
        
        input.close();
    }
    
}
