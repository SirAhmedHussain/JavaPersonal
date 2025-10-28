import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("It was a _____, cold November day.");
        System.out.print("Enter a word: ");
        String FirstWord = input.nextLine();

        System.out.println("I woke up to the _______(adjective) smell");
        System.out.print("Enter a word: ");
        String SecondWord = input.nextLine();

        System.out.println("of ______ roasting");
        System.out.print("Enter a word: ");
        String ThirdWord = input.nextLine();

        System.out.println("in the _______ downstairs.");
        System.out.print("Enter a word: ");
        String FourthWord = input.nextLine();

        System.out.println("I ________ down the stairs to see");
        System.out.print("Enter a word: ");
        String FifthWord = input.nextLine();

        System.out.println("if I could help _______ the dinner");
        System.out.print("Enter a word: ");
        String SixthdWord = input.nextLine();

        System.out.println("My mom said, 'see if ______ needs");
        System.out.print("Enter a word: ");
        String SeventhWord = input.nextLine();

        System.out.println("a fresh _____.' ");
        System.out.print("Enter a word: ");
        String EightWord = input.nextLine();

        System.out.println("So I carried a tray of glasses full of ______");
        System.out.print("Enter a word: ");
        String NinthWord = input.nextLine();

        System.out.println("into the _______ room.");
        System.out.print("Enter a word: ");
        String TenthWord = input.nextLine();

        System.out.println("When I got there, I couldnt believe my ______!");
        System.out.print("Enter a word: ");
        String EleventhWord = input.nextLine();

        System.out.println("There were _______");
        System.out.print("Enter a word: ");
        String TwelvetWord = input.nextLine();

        System.out.println("______ on");
        System.out.print("Enter a word: ");
        String ThirteenthWord = input.nextLine();

        System.out.println("the _______!!");
        System.out.print("Enter a word: ");
        String FourtheenthWord = input.nextLine();
        
        
        System.out.print("It was a " + FirstWord + ", cold November day.");
        System.out.print("I woke up to the " + SecondWord +" smell");
        System.out.println(" of "+ ThirdWord +" roasting");
        System.out.print("in the "+ FourthWord +" downstairs.");
        System.out.print(" I " + FifthWord + " down the stairs to see");
        System.out.println(" if I could help " + SixthdWord + " the dinner");
        System.out.print("My mom said, 'see if " + SeventhWord +" needs");
        System.out.print(" a fresh " + EightWord + ".' ");
        System.out.println("So I carried a tray of glasses full of " + NinthWord);
        System.out.print("into the " + TenthWord + " room.");
        System.out.print(" When I got there, I couldnt believe my " + EleventhWord + "!");
        System.out.println(" There were" + TwelvetWord+ " ");
        System.out.print( ThirteenthWord + "on");
        System.out.print(" the " + FourtheenthWord + " !!");



        
        input.close();
    }
    
}
