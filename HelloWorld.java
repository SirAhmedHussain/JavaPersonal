public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!!");
        int x = 1;
        System.out.println("Currently Outside of the loop");
        while (x < 5) {
            System.out.println("Inside the loop x is "+ x);
            x = x+1; 
        }
        System.out.print("Outside the loop");
    }
}