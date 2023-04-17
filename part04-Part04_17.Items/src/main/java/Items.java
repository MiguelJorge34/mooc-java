
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String item = scanner.nextLine();
            
            if(item.equals("")){
                break;
            }
            
            Item use = new Item(item);
            
            items.add(new Item(item));
            
            for(Item i : items){
                System.out.println(items);
            }
            
            
            
        }

    }
}
