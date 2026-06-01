public class Repeated 
{
    public static char FirstRepeated(String s)
    {
        for(int i=0; i<=s.length()-2; i++)
        {int count=0;
        {
            for(int j=i+1; j<=s.length()-1; j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                    
                }
            }
        }
        if(count==0)
        {
            return s.charAt(i);
        }
    } 
    return ' ';
}
public static void main(String args[])
{
    System.out.println(FirstRepeated("abccb"));
}
}