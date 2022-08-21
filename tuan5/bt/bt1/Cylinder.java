package tuan5.bt.bt1;

public class Cylinder extends Circle {
    private double height =1;
    public Cylinder(){
    }
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
    @Override
    public String toString(){
        return super.toString()+" the tich: "+getVolume();
    }

    public static void main(String[] args) {
        Cylinder cl= new Cylinder();
        System.out.println(cl);
        cl=new Cylinder(4.3,"blue",4);
        System.out.println(cl);
    }
}
