
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int sum = 1;
        
        int limit = Integer.valueOf(scanner.nextLine());
        
        for(int i = 1; i <= limit ; i++){
            sum *= i;
        }
        System.out.println("Factorial: "+sum);

    }
}
