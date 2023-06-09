/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migueljorge
 */
public class Archive {
    
    private String identifier;
    private String name;
    
    
    public Archive(String identifier,String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public String getIdentifier(){
        return identifier;
    }
    
    public String toString(){
        return identifier +": "+name;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        if(this.identifier.equals(comparedArchive.identifier)){
            return true;
        }
        return false;
    
    
    }
    
    
    
}
