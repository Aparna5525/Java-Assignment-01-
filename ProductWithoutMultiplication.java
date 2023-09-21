public class ProductWithoutMultiplication {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        int product = 0;
        for(int i = 0; i < b; i++) {
            product += a;
        }
        
        System.out.println("Product: " + product);
    }
}
