abstract class Vehicle 
{
    abstract void start(); //partial abstract
    public void stop(){    //normal method
        System.out.println("Stopped");
    }

}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car Started");
    }
}
public class Abstraction 
{
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println();
        v.start();
        v.stop();
    }
}
