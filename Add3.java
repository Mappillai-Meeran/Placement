public class Add3 {
 public static int addTwoNumbers(int a, int b) {
        int c=a+b;
        return c;
    }
    public int addTwoNumbers(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]) {
        Add3 a=new Add3();

        System.out.println(a.addTwoNumbers(10, 20, 43));
    }
}
