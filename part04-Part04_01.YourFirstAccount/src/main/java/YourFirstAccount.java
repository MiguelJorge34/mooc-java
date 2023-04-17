
public class YourFirstAccount {

    public static void main(String[] args) {
        Account testBobAccount = new Account("Miguel", 100.0);
        
        testBobAccount.deposit(20.0);
        
        System.out.println(testBobAccount);
    }
}
