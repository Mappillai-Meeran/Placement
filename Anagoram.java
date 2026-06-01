import java.util.Arrays;
public class Anagoram 
{
    public static boolean isAnagram(String Str1, String Str2)
    {
      String a= "Heart";
      String b= "Earth";
      Str1=Str1.toLowerCase();
        Str2=Str2.toLowerCase();
        char[] c1= Str1.toCharArray();
        char[] c2=Str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length!=c2.length)
        {
            return false;
        }
return true;
}
public static void main(String[] args)
{
    System.out.println(isAnagram("Heart", "Earth")); 
    }
}
