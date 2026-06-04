class Animal
{
    public void makeSound()
    {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal
{
    @Override //it shows the annotation of method makeSound()
    public void makeSound()
    {
        System.out.println("Dog Bark");
    }
}
public class OverRide{
public static void main(String args[])
{
    Dog D = new Dog(); //runtime polymorphism if u put Animal it give the Dog Bark bcs it have obj of Dog
    D.makeSound();
}
}