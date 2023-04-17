
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            
            String[] splitStringArray = input.split(" ");
            
            
            for(String e :splitStringArray ){
                if(e.contains("av")){
                    System.out.println(e);
                }
            }
            if(input.equals("")){
                break;
            }
        
        }


    }
}
