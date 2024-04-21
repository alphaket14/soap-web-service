import org.tempuri.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        CalculatorSoap calculator = new Calculator().getCalculatorSoap();
        int sum = calculator.add(num1, num2);
        int product = calculator.multiply(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        sc.close();
//    
    }
}