public class SimpleInterest1Calculator {
    public static void main(String[] args) {
        double principal = 1000; // Example principal amount
        int time = 2; // Example time in years
        
        for (int rate = 1; rate <= 10; rate++) {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest at " + rate + "%: " + simpleInterest);
        }
    }
}
