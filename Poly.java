class Calculator 
{
    public int add(int a, int b)
    {
    return a+b;
    } 
public int add(int a, int b, int c)
    {
    return a+b+c;
    }
}

public class Poly 
{
    public static void main(String[] args)
    {
        Calculator a  = new Calculator();
        System.out.println(a.add(11, 12, 14));
    }
}
