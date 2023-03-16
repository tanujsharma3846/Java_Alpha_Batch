public class question2 {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.weight);
    }
}
class Person{
    String name;
    int weight=69;

}
class Student extends Person{
    int rollNumber;
    String SchoolNumber;
}
