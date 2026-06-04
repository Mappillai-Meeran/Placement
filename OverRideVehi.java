class Vehicle1
{
    public void start()
    {
        System.out.println("Car");
    }
}
class Vehicle2 extends Vehicle1
{
    public void start()
    {
        System.out.println("Bike");
    }
}
class Vehicle3 extends Vehicle1
{
    public void start()
    {
        System.out.println("Bus");
    }
}
public class OverRideVehi
{
    public static void main(String args[]){
    Vehicle1 a = new Vehicle3(); //one type
    a.start();
    a=new Vehicle2(); //2nd type
    a.start();
    a = new Vehicle3();
    a.start();
    }
}