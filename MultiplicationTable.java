import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int x = 1;

        while(x < 11){
            System.out.println(x+" x "+num+" = "+x*num);
            x +=1;
        }
        input.close();

    }
    
}
