
import java.util.ArrayList;


public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics(){}
    
    public void addNumber(int number){
        this.sum = sum + number;
        this.count++;
        
    }
    
    public int getCount(){
        return count;
    }
    
    public int sum (){
        
        
        return this.sum;
    }
    public double average() {
        double result = 0;

        if (this.sum != 0 && this.count != 0) {
            result = 1.0 * this.sum / this.count;
        }
        return result;
    }
 }
