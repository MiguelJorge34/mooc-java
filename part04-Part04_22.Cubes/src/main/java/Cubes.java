
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int mult = 0;
        
        while(true){
            String line = scanner.nextLine();
            
            if(line.equals("end")){
                break;
            }
            
            int i = Integer.parseInt(line);
            
            mult = (int)Math.pow(i,3);
            
            System.out.println(mult);
        
        }

    }
}
