public class static_first {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.SchoolName="JMV";

        Student s2=new Student();
        System.out.println(s2.SchoolName);

        Student s3=new Student();
        s3.SchoolName="jai shree ram school";
        System.out.println(s2.SchoolName);

    }
}
class Student{
    static int returnPercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }
    
    String name;
    int roll;

    static String SchoolName;

    void getName(String name){
        this.name=name;
    }
    String getNmae(){
        return this.name;
    }
}
