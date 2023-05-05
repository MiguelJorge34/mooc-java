
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migueljorge
 */
public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    
    public boolean isEmpty(){
        boolean isEmpty = false;
        
        if(this.stack.size() == 0){
            isEmpty = true;
            
        }
        return isEmpty;
    }
    
    public void add(String value){
        this.stack.add(value);
    
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        return this.stack.remove(stack.size() -1);
    }
}
