
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSize(){
        return squares;
    }
    public int getPrices(){
        return squares * princePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.getSize()){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        
        int difference = compared.getPrices() - this.getPrices();
        
        return Math.abs(difference);
        
    
    }
    public int priceDifference1(Apartment compared){
        
        int difference = compared.getPrices() - this.getPrices();
        
        return (difference);
        
    
    }
    
     public boolean moreExpensiveThan(Apartment compared) {
         if(priceDifference1(compared) > 0 ){
             return false;
         }
         else {
             return true;
         }
         
     }

}
