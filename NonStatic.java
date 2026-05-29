public class NonStatic {
    public int addTwoNumbers(int a, int b) {
        int c=a+b;
        return c;
    }
    public static void main(String args[]) {
        NonStatic a = new NonStatic();
        System.out.println(a.addTwoNumbers(10, 20));
    }
