public class Doubles {
    public static void main(String[] args) {
       
        int dice1 = randomNumber();
        int dice2 = randomNumber();

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);

        while(dice1 != dice2){
            dice1 = randomNumber();
            dice2 = randomNumber();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
        }

        System.out.println("You rolled doubles!");
    }

    public static int randomNumber(){
        double random = Math.random() * 6;
        return (int)random + 1;
    }

}





