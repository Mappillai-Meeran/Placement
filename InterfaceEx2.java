interface Payment{
    void makePayment();
}
class phonep implements Payment
{
    public void makePayment()
    {
        System.out.println("Phonepay");
    }
}
    class googlepay implements Payment
    {
        public void makePayment()
        {
            System.out.println("Googlepay");
        }
    }
        class paytm implements Payment
        {
            public void makePayment()
            {
                System.out.println("Paytm");
            }
        }
public class InterfaceEx2
{
    public static void main(String[] args)
    {
        Payment v = new phonep();
        v.makePayment();
        Payment a = new googlepay();
        a.makePayment();
        Payment b = new paytm();
        b.makePayment();

        

    }
}
