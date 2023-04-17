
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = "Caput Draconis";
        
        System.out.println("Password?");
        String tent = scan.nextLine();
        
        if(!tent.equals(password)){
            System.out.println("Off with you!");
        }else{
            System.out.println("Welcome!");
        }
    }
}
