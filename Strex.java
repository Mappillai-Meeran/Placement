public class Strex
{
    public static void main(String args[])
    {
        String S1="Hello";
        S1 = S1.concat("world");
        System.out.println(S1);
        StringBuilder S2 = new StringBuilder("JAVA");
        S2.append(" Programming");
        System.out.println(S2);
        System.out.println(S2.charAt(6));
        System.out.println(S2.reverse());
        int c='8';
        System.out.println(c);
        String a="Hello";
        String b="Hello";
        System.out.println(a.equals(b));
        System.out.println(a==b);
        for(int i=0;i<a.length(); i++)
        {
            System.out.print(a.charAt(i));
        }
        System.out.println();
        for(char ch: a.toCharArray())
        {
            System.out.print(ch);
        }
    }
}