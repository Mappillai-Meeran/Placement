class BankAccount
{
    public double balance=0; //private to
}
public class EncapsulatEx
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount();
        account.balance = 1000; //its not secured we have to use method
        System.out.println(account.balance);
    }
}
