import java.util.Scanner;
public class BlastOff {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Give us a number: ");
        int num = input.nextInt();
        
        if(num > 0){
            while(num > 0){
                System.out.println(num);
                num -= 1;
            }
            System.out.println("BLAST OFF!!!");
        }

        input.close();

    }
    
}
