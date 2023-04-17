import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        double dNumber = Math.pow(number,2.0);
        System.out.println((int)dNumber);

    }
}
