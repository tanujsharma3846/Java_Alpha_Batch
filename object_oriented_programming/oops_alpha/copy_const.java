public class copy_const {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="tanuj";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2=new Student(s1);
        s2.password="abcd";

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // copy const 
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }
    Student(){
        System.out.println("constructor is called ...");
    }


}
