import java.util.Random;

public class RollingDice {
    public static void main(String[] args){

        Random random = new Random();

        int die1 = random.nextInt(1,7);
        int die2 = random.nextInt(1,7);

        int total =  die1 + die2;

        int count =0;
        
        while(total != 7){
            die1 = random.nextInt(1,7);
            die2 = random.nextInt(1,7);
            total =  die1 + die2;
            System.out.println(die1 + " + " + die2 + " = " + total);
            count++;
        }
        System.out.println("You Won after "+count+" tries");
    }    
}
