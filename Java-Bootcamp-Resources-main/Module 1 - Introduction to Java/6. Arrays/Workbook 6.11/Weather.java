import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);
        printTemperatures(celsius, "Celsius");
        System.out.println("");
        printTemperatures(fahrenheit, "Fahrenheit");
        

    }

    public static double[] celciusToFahrenheit(double[] values){
        double[] fahrenheit = new double[values.length];
        for(int i = 0; i < values.length; i++){
            fahrenheit[i] = values[i] / 5 * 9 + 32;
        }
        return fahrenheit;
    }

    public static void printTemperatures(double[] temp, String temptype){
        System.out.print(temptype + ": ");
        for(double tempItem : temp){
            System.out.print(tempItem + ", ");
        }
    }

}
