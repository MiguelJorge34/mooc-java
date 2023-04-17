
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        
        ArrayList <String> names = new ArrayList<>();
        
        ArrayList <Integer> year = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.length() > 0){
                String [] splitInput = input.split(",");
                
                names.add(splitInput[0]);
                
                year.add(Integer.parseInt(splitInput[1]));
            
            }
            if (input.equals("")){
                break;
            }
            
        }
        int sumYears = 0;
            
        for(int age : year){
            sumYears += age;
        }
            
        double averageYears = 1.0 * sumYears / year.size();
            
        String longestName = "";
            
        for(String name : names){
            if(name.length() > longestName.length()){
                longestName = name;
            }
        }
        
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+averageYears);
            
        


    }
}
