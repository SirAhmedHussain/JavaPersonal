import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("What item would you like to buy? ");
        String item = input.nextLine();
        System.out.println("");

        System.out.print("What is the price of each item? ");
        double price = input.nextDouble();
        System.out.println("");


        System.out.print("How many would you like? ");
        int amount = input.nextInt();
        System.out.println("");

        System.out.println("You have bought " + amount + " " + item + "/s");
        System.out.println("Your total is $" + amount*price +".");
        System.out.println("");

        input.close();
    }
    
}
