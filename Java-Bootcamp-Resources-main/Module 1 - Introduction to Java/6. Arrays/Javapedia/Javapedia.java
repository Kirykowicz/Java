import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        
        int figures = scan.nextInt();
        
        String[][] database = new String[figures][3];
         
        scan.nextLine();
         for(int i = 0; i < database.length; i++){
            System.out.println("figure " + (i + 1));
            System.out.print("\tname: ");
            database[i][0] = scan.nextLine();
            System.out.print("\tDate of Birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\tOccupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
         }

        System.out.println("These are the values you stored:\n"); 
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");  
        String search = scan.next();
        
        for(int i = 0; i < database.length; i++){
            if(database[i][0].equals(search)){
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of Birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }

        scan.close();
    }

     public static void print2DArray(String[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
     }

}
