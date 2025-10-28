public class BottlesOfBeer {
    public static void main(String[] args){
        int beerNum = 5;
        String word = "bottles";

        while(beerNum > 0){
            if(beerNum == 1){
                word = "bottle";
            }
            if (beerNum > 0){
                System.out.println(beerNum + " "+ word +" of beer on the wall");
                System.out.println(beerNum+ " "+ word+ " of beer.");
                System.out.println("Take one down.");
                beerNum -= 1;
                System.out.println("Pass it around");
            } else{
                System.out.println("No More bottles of beer on the wall");
            }

        }

    }
}
