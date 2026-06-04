class Student 
{
    private String name;
    private int age;
    private double salary;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getSalary() 
    {
        return salary;
    }
}

public class EncapStudent
{
    public static void main(String[] args) 
    {
        Student account = new Student();
        account.setName("Meeran");
        account.setAge(25);
        account.setSalary(50000.0);
        System.out.println("Name: " + account.getName());
        System.out.println("Age: " + account.getAge());
        System.out.println("Salary: " + account.getSalary());
    }
}