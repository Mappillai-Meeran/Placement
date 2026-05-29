public class Add2 {
 public static int addTwoNumbers(int a, int b) {
        int c=a+b;
        return c;
    }
    static void change(int x){
        x= 500;
        System.out.println("Inside method:" + x);
    }
    public static void main(String args[]) {
        int y=5;
        change(y);
        System.out.println("Outside method:" + y);
        System.out.println(addTwoNumbers(10, 20));
    }
}
