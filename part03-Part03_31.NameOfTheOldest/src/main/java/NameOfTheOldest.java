
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

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
        int place = 0;
        for(int i = 0 ; i < age.size(); i++){
           if(age.get(i) > max){
               max = age.get(i);
               place = i;
           }
            
        }
        
        System.out.println("Name of the oldest: "+names.get(place));
        
        
        
        
    }
}
