import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in KG: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        System.out.println("BMI: " + bmi);
    }
}
