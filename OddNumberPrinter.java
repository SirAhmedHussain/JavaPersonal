import java.util.Scanner;

public class OddNumberPrinter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lo and Behold my aweosomeness give us a number go on give us: ");
        int x = input.nextInt();

        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
        
        input.close();

    }
}