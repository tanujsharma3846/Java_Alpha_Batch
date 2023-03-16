
public class getters_setters{
    public static void main(String[] args) {
        Pen p1=new Pen(); // created a pen object named p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int Tip){
        this.tip=Tip;

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
