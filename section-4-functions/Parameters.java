public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.6);
    }

    public static void calculateArea(double length, double width){
        double area = length * width;
        System.out.println("Area: " + area);
    }
}
