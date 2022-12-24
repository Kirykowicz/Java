public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
       sing(3);
    }

    public static void sing(int times){
        for (int i = times; i >= 1; i--){
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            System.out.println("take one down, pass it around " + (i - 1) + " bottles of beer on the wall!");
        }
    }
}
