
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        
        while(true){
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.nextLine());
            
            if(numb == 0){
                break;
            }else if(numb > 0){
                count += numb;
                count1++;
                
            }
        }
        if(count1 >0){
            double average = 1.0 * count / count1;
            System.out.println("Average of the numbers: "+ average);
        }else{
            System.out.println("Cannot calculate the average");
        }
        


    }
}
