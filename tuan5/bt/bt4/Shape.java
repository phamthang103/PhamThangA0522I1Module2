package tuan5.bt.bt4;

public class Shape {
    private String color= "Green";
    private boolean filled= true;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled= filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "A Shape with color of "+  color+ " filled: "+filled;
    }
    public static void main(String[] args) {

        inheritance.th.Shape shape = new inheritance.th.Shape();
        System.out.println(shape);

        shape = new inheritance.th.Shape("red", false);
        System.out.println(shape);
    }
}
