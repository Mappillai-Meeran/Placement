public class RevStr {
    public static String reverseString(String str) {
        if (str == null)
            return null;
        StringBuilder sb = new StringBuilder(str);
        for(int i=str.length()-1; i>=0; i--)
        {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        String S1= "Reverse";
        String reversed = reverseString(S1);
        System.out.println("Original string:" + S1);
        System.out.println("Reverse String:" + reversed);
    }
}
