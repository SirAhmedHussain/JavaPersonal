import java.util.Scanner;
import java.text.DecimalFormat;

public class Atm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to my bank please select one of the options below, enter the number assosicated with your choise(ie. enter the number 2 to deposit money)");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Select an Option: ");
        int x = input.nextInt();
        long number = 4678900;
        DecimalFormat formatter = new DecimalFormat("#,###");
        
        
       while(x != 4){  
        while(x > 4 || x < 1){
            System.out.println("Welcome to my bank please select one of the options below, enter the number assosicated with your choise(ie. enter the number 2 to deposit money)");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("Select a valid Option: ");
            x = input.nextInt();
        }
        
        if(x == 1){
            System.out.println();
            System.out.println("Your Current balace is $" +formatter.format(number));
            System.out.println("Press 2 for more services or 4 to exit");
            x = input.nextInt();
            while(x != 2 && x != 4){
                System.out.println("Enter a valid options: ");
                x = input.nextInt();
                System.out.println();
            }
            if(x == 2){
                System.out.println();
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println();
                System.out.println("Select an Option: ");
                x = input.nextInt();
            }else if(x == 4){
                break;
            }

        }else if(x == 2){
            System.out.println();
            System.out.println("How much would you like to deposit: ");
            long deposit = input.nextInt();
            number += deposit;
            System.out.println();
            System.out.println("Your deposit was successful");
            System.out.println("Press 2 for more services or 4 to exit");
            x = input.nextInt();
            while(x != 2 && x != 4){
                System.out.println("Enter a valid options: ");
                x = input.nextInt();
                System.out.println();
            }
            if(x == 2){
                System.out.println();
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println();
                System.out.println("Select an Option: ");
                x = input.nextInt();
            }else if(x == 4){
                break;
            }

        }else if(x == 3){
            System.out.println();
            System.out.println("How much would you like to withdraw: ");
            long withdraw = input.nextInt();
            if(number > withdraw){
                number -= withdraw;
                System.out.println();
                System.out.println("Your withdrawal was successful");
                System.out.println("Press 2 for more services or 4 to exit");
                x = input.nextInt();
                while(x != 2 && x != 4){
                    System.out.println("Enter a valid options: ");
                    x = input.nextInt();
                    System.out.println();
                }
                if(x == 2){
                    System.out.println();
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.println();
                    System.out.println("Select an Option: ");
                    x = input.nextInt();
                }else if(x == 4){
                    break;
                }
            }else{
                System.out.println("Inufficient balance");
                System.out.println("Fuck off brokie");
                break;

            }
            
        }

       }
       System.out.println();
       System.out.println("Have a nice day");

        input.close();
    }

}
