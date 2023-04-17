
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        
        ArrayList <String> names = new ArrayList<>();
        
        ArrayList <Integer> age = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.length() > 0){
                String [] splitInput = input.split(",");
                
                names.add(splitInput[0]);
                
                age.add(Integer.parseInt(splitInput[1]));
            
            }
            if (input.equals("")){
                break;
            }
            
        }

        for(int i = 0 ; i < age.size(); i++){
            max = Math.max(max,age.get(i));
            
        }
        
        System.out.println("Age of the oldest: "+max);
        
        
        
        
    }
}
