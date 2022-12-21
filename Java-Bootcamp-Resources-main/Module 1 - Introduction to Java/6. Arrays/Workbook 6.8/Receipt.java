public class Receipt {
    public static void main(String[] args) {


        System.out.println("Here's your receipt:\n");
        
        // See instructions on Learn the Part (Workbook 6.8)

        String[] apple = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 1.49, 1.29};

        for(int i = 0; i < apple.length; i++){
            System.out.println("\t" + apple[i] + " $" + price[i]);
        }
        
    }
}
