public class abstract_first {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        Chicken c=new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        Mustang myHorse =new Mustang();
        // animal->horse->mustang
    }
}
abstract class Animal{
    String color;

    Animal(){
        System.out.println("animlal constructor is called");
        color="brown";
    }
    void eat(){
        System.out.println("animal can eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called");
    }
    void changeColor(){
        color="pink";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
} 
class Chicken extends Animal{
    void changeColor(){
        color="pink";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("MUstang const called");
    }
}
