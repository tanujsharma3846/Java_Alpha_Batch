
public class mulit_level{
    public static void main(String[] args) {
        Dog doggy=new Dog();
        doggy.eat();
        doggy.breathe();
        doggy.legs=4;
        System.out.println(doggy.legs);
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
    int legs;
}
// derived class
class Dog extends Mammal{
    String breed;
}
