
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        
        while(true){
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.nextLine());
            
            if(numb == 0){
                break;
            }else{
                count += numb;
                count1++;
            }
        }
        System.out.println("Number of numbers: "+ count1);
        System.out.println("Sum of the numbers: "+ count);

    }
}
