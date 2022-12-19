import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions.


        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        //store answer 1
        String country = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        //store answer 2
        String planet = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        //store answer 3
        String blood = scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        //store answer 4
        String friend = scan.nextLine();

        int score = 0;
        if(country.equals("c")){
            score += 5;
        }
        if(planet.equals("a")){
            score += 5;
        }
        if(blood.equals("d")){
            score += 5;
        }
        if(friend.equals("a") || friend.equals("b")){
            score += 5;
        }

        if(score >= 15){
            System.out.println("\nWow, you know your stuff!");
        } else if(score < 15 && score >= 5){
            System.out.println("\nNot bad!");
        } else {
            System.out.println("\nBetter luck next time!");
        }
        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        
        System.out.println("\nYour final score is: " + score + "/20");

        scan.close();

    }
}
