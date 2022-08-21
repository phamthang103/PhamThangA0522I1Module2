package tuan4;

public class Circle {
    private double radius=1;
    private String color="red";

    public Circle() {

    }
    public Circle(double radius){
        this.radius=  radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public static void  main(String[]  args){
        Circle ht= new Circle(2);
        System.out.println("Radius: "+ht.getRadius()+ "   Color: "+ ht.color);
        System.out.println("Area: "+ht.getArea());
    }
}
