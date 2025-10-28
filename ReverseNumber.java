import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to be reversed: ");
        int num = input.nextInt();

        int len = String.valueOf(num).length();

        for(int i = 0; i < len; i++){
            int digit = num % 10;
            num = num/10;
            System.out.print(digit);

        }        
        input.close();
    }

}
