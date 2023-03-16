public class question4 {
    public static void main(String[] args) {
        Car c=new Car();
        Vehicle v=new Vehicle();
        Vehicle v2=new Car();
        //Car c=new Vehicle();
    }
}
class Vehicle{};
class Car extends Vehicle{};
