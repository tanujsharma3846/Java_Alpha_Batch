
public class heirarchy_inheritanced{
    public static void main(String[] args) {
        Mammal doggy=new Mammal();
        doggy.eat();
        doggy.breathe();
        doggy.walk();
        doggy.color="pink";
        System.out.println("color of dog is "+doggy.color);
    }
}
// base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

