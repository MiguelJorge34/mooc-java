
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            list.add(input);
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int nums : list){
            min = Math.min(nums, min);
        }
        System.out.println("Smallest number: "+min);
        
        for (int i = 0; i < list.size(); i++) {
            
            if(list.get(i) == min){
                System.out.println("Found at index: "+ i);
            }
        }
    }
}
