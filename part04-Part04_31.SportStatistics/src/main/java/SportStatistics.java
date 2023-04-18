
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("file: ");

        String fileName = scanner.nextLine();

        System.out.println("Team: ");
        String searchForTeam = scanner.nextLine().toLowerCase();

        int gameCounter = 0;

        int wins = 0;

        int losses = 0;
        try(Scanner input = new Scanner(Paths.get(fileName))){
            
            while(input.hasNextLine()){
            
                String [] splitLine = input.nextLine().split(",");
                
                if(splitLine.equals("")){
                    break;
                }
                
                String homeTeam = splitLine[0];
                String awayTeam = splitLine[1];
                
                int homePoints = Integer.valueOf(splitLine[2]);
                int awayPoints = Integer.valueOf(splitLine[3]);
                
                if(searchForTeam.equals(homeTeam.toLowerCase())){
                    gameCounter ++;
                    
                    if(homePoints > awayPoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }
                if(searchForTeam.equals(awayTeam.toLowerCase())){
                    gameCounter ++;
                    
                    if(homePoints > awayPoints){
                        losses++;
                    }else{
                        wins++;
                    }
                }
            }
                
            System.out.println("Games: " + gameCounter);

            System.out.println("Wins: " + wins);

            System.out.println("Losses: " + losses);
                
                
            
            
            
            
            
            
         }catch(Exception e){
             System.out.println("Error:"+e.getMessage());
             
         }

    }

}
