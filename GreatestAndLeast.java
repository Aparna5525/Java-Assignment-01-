import java.util.Scanner;

public class GreatestAndLeast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter three numbers separated by spaces: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int greatest = Math.max(Math.max(a, b), c);
        int least = Math.min(Math.min(a, b), c);
        
        System.out.println("The greatest of the three numbers is: " + greatest);
        System.out.println("The least of the three numbers is: " + least);
    }
}
