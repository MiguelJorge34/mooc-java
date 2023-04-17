
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
       
        
        Scanner scanner = new Scanner(System.in);
        
        int odd = 0;
        int even = 0;
        int sum = 0;
        int count = 0;
        
        System.out.println("Give me numbers:");
        while(true){
            int numbers = Integer.valueOf(scanner.nextLine());
            
            if(numbers == -1){
                break;
            }
            
            if(numbers % 2 == 0){
                even++;
            }else{
                odd++;
            }
            
            sum += numbers;
            count++;
            
        
        
        }
        
        double average = 1.0 * sum / count;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+count);
        System.out.println("Average: "+average);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);

    }
}
