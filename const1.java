class Student 
{
    String name;
    int age;
    Student() //default constructor
    {
        this.name= "default"; //"this" keywrd is refers to instance variable
        this.age = 24;
    }
    Student(String n,int a) //parameterized constructor
    {
        this.name = n;
        this.age = a;
    }
    Student(String n) //Parameterized Constructor (One Argument):
    {
        this.name = n;
        this.age = 22;
    }
    public void display()
    {
        System.out.println("Name:"+ name +" "+ "Age:"+ age);
    }
}    
public class const1
{
    public static void main(String args[])
    {
    Student student1=new Student();
    //student1.name="Test1";
    //student1.age=28;
    student1.display();
    }
}