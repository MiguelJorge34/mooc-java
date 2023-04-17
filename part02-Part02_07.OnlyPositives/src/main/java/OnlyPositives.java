
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int control = Integer.valueOf(scanner.nextLine());
            
            if(control == 0){
                break;
            }else if(control < 0){
                System.out.println("Unsuitable number");
            }else{
                double mult = Math.pow(control,2);
                System.out.println((int)mult);
            }
        }

    }
}
