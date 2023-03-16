public class types_of_consts {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("shraddha");
        Student s3=new Student(123);
    }
}
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called ...");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
