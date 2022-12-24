public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.
        for (int i = 0; i <= 19; i++){
            String oddOrEven = (i % 2 == 0) ? "even" : "odd";
            System.out.println(i + " - " + oddOrEven);
        }
    }
}
