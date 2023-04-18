import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        
        String file = scanner.nextLine();
        
        try(Scanner input = new Scanner (Paths.get(file))){
            
            while(input.hasNextLine()){
                String line = input.nextLine();
                
                String [] lineSplit = line.split(",");
                
                if(lineSplit.equals("") ){
                    break;
                }
                
                String name = lineSplit[0];
                
                int age = Integer.valueOf(lineSplit[1]);
                
                if(age > 1 || age == 0){
                    System.out.println(name + "age: "+age+" years");
                }
                
                System.out.println(name + "age: "+age+" year");
            
            
            }
        
        
        }
        
        

    }
}
