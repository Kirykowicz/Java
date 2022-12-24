import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        int secretNumber = 3;
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);

       int guess = scan.nextInt();

       while(guess != secretNumber){
        System.out.print("Guess again ");
        guess = scan.nextInt();
       }
       
       System.out.println("You got it!");

       //See Learn the Part for detailed instructions.
        
        scan.close();
    }

}
