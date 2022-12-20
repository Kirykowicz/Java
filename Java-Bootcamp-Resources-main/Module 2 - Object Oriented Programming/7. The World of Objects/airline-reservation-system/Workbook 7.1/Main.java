import java.util.Arrays; 
public class Main {
    public static void main(String[] args) {
        Person robert = new Person();
        robert.name = "Robert";
        robert.nationality = "American";
        robert.dateOfBirth = "4/28/91";
        robert.passport = new String[] {robert.name, robert.nationality, robert.dateOfBirth};
        System.out.println(robert.name);
        System.out.println(robert.nationality);
        System.out.println(robert.dateOfBirth);
        System.out.println(Arrays.toString(robert.passport));
        System.out.println(robert.seatNumber);
    }
}
