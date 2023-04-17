
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstN = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondN = Integer.valueOf(scanner.nextLine());
        int sum = firstN * secondN;
        System.out.println(firstN + " * "+secondN +" = "+ sum);

    }
}
