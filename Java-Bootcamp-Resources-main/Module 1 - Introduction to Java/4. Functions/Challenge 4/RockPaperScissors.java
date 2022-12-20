import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nLet's play Rock Paper Scissors.");
        System.out.println("\nWhen I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("\nAre you ready? Write 'yes' if you are.");

        String ready = scan.nextLine();

        if(ready.equals("yes")){
            System.out.println("\nGreat!");
            System.out.println("\nrock - paper - scissors, shoot!");
            String choice = scan.nextLine();
            String computerChoice = computerChoice();
            System.out.println("\nYou chose:\n" + choice);
            System.out.println("\nThe computer chose:\n" + computerChoice);
            System.out.println("\n" + result(choice, computerChoice) + "\n");
        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }

    public static String computerChoice() {
        double randomNumber = Math.random() * 3;
        int integer = (int)randomNumber;

        switch (integer) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        
        if(yourChoice.equals("rock") && computerChoice.equals("paper")){
            result = "You lose";
        }else if(yourChoice.equals("rock") && computerChoice.equals("scissors")){
            result = "You win";
        } else if(yourChoice.equals("paper") && computerChoice.equals("rock")){
            result = "You win";
        }else if(yourChoice.equals("paper") && computerChoice.equals("scissors")){
            result = "You lose";
        }else if(yourChoice.equals("scissors") && computerChoice.equals("rock")){
            result = "You lose";
        }else if(yourChoice.equals("scissors") && computerChoice.equals("paper")){
            result = "You win";
        } else if (yourChoice.equals(computerChoice)){
            result = "It's a tie!";
        }

        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

}
