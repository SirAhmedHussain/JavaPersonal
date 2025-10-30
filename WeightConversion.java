import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.println("");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();

        if(choice != 1 && choice !=2 ){
            System.out.println("Please enter a valid choice");
        }else if(choice == 1){
            System.out.print("Enter lbs: ");
            int lbs = input.nextInt();
            double kg = (double)(lbs/2.205);
            System.out.printf("The weight in kg is: %.2f kg", kg);
        }else if(choice == 2){
            System.out.print("Enter kg: ");
            int kg = input.nextInt();
            double lbs = (double)(kg*2.205);
            System.out.printf("The weight in kg is: %.2f lbs", lbs);
        }
        
        input.close();

    }
    
}
