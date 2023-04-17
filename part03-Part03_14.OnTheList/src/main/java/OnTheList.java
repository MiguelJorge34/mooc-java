
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String search = scanner.nextLine();
        
        int i = 0;
        
        while(i < list.size()){
            if(list.get(i).equals(search)){
                System.out.println(search+" was found!");
                break;
            }else if(i == list.size()-1){
                System.out.println(search+" was not found!");
            }
            i++;
            
        }

    }
}
