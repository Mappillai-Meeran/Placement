class Student {
    String name;
    int age;
    public void display(){
        System.out.println("Name:"+ name + "Age:"+ age);
    }
}    
public class obj
{
    public static void main(String args[])
    {
    Student student1=new Student();
    student1.name="Test1";
    student1.age=28;
    student1.display();
}
}