import java.nio.ReadOnlyBufferException;

public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        System.out.print("\nHere are the scores: ");
        for(int i = 0; i < scores.length; i++){
            if(scores[i] > highScore){
                highScore = scores[i];
            }
            System.out.print(scores[i] + " ");
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }
    
    public static int randomNumber(){
        double decimal = Math.random() * 50000;
        return (int)decimal;
    }

}
