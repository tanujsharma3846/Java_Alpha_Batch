public class oops{
    public static void main(String[] args) {
        Pen p1=new Pen(); // created a pen object named p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("yellow");
        System.out.println(p1.color);

    }

}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;

    }
}
class Student{
    String name;
    String age;
    float percentage;

    void calPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;

    }


}