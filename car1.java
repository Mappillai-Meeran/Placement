class car
{
    String brand;
    int speed;
    public void display()
    {
        System.out.println("Brand:"+ brand+ " "+ "Speed:"+ speed);
    }
}
public class car1 {
    public static void main(String args[]){
     car a = new car();
     a.brand = "BMW";
     a.speed = 12;
     a.display();}
}
