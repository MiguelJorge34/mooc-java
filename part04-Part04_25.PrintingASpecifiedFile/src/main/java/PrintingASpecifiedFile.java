
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        
        String file = scanner.nextLine();
        
        try(Scanner in = new Scanner (Paths.get(file))){
            while(in.hasNextLine()){
                
                String line = in.nextLine();
                
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Erro" + e.getMessage());
        }
        

    }
}
