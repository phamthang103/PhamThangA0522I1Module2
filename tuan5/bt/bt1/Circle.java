package tuan5.bt.bt1;

public class Circle {
    double radius=1.0;
    private String color="Green";

    public Circle(){
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "ban kinh: "+radius+" mau sac "+color+" chu vi:"+getPerimeter()+" dien tich: "+getArea();
    }

    public static void main(String[] args) {
        Circle  cr= new Circle();
        System.out.println(cr);
        cr= new Circle(3.2,"red");
        System.out.println(cr);
        System.out.println(cr);

    }
}
