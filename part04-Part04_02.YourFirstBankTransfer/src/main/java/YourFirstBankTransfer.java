
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account testAccount1 = new Account("Matthews account", 1000.0);
        
        Account testAccount = new Account("My account", 0.0);
        
        testAccount1.withdrawal(100.0);
        
        testAccount.deposit(100.0);
        
        System.out.println(testAccount1.toString());
        System.out.println(testAccount.toString());
        
    }
}
