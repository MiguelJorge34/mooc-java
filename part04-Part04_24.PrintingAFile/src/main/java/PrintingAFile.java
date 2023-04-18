
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws IOException {
        
        try(Scanner scanner = new Scanner (Paths.get("data.txt"))){
            while(scanner.hasNextLine()){
                
                String line = scanner.nextLine();
                
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Erro" + e.getMessage());
        }
        

    }
}
