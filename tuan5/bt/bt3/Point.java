package tuan5.bt.bt3;

public class Point {
    public float x=1;
    public float y=1;

    public Point(){
    }
    public Point(float x, float y){
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
    public String toString(){
        return "x la: "+x+" y la: "+y;
    }
}
