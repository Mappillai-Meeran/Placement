class Meeran {
    int age;
    String dept;
    public void display()
    {
        System.out.println("Dept:"+dept +" " +"Age:"+age);
    }
}
public class Clg
{
    public static void main(String args[])
    {
        Meeran a = new Meeran();
        a.age=23;
        a.dept = "MCA";
        a.display();
    }
}