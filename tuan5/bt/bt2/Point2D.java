package tuan5.bt.bt2;

public class Point2D {
    public float x=1;
    public float y=1;

    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float array[] = {x,y};
        return array;
    }
    @Override
    public String toString(){
        return "x: "+x+" y: "+y;
    }

    public static void main(String[] args) {
        Point2D  p2=  new Point2D();
        System.out.println(p2);
        p2= new Point2D(3,4);
        float array[]= p2.getXY();;
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }
}
