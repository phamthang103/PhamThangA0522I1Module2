package tuan5.bt.bt3;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed= 0.0f;
    public MovablePoint(){

    }
    public MovablePoint(float xSpeed, float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float x, float y,float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float  ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float []  array={xSpeed,ySpeed};
        return array;
    }
    @Override
    public String toString(){
        return super.toString()+", speed=("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint  move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }

    public static void main(String[] args) {
        MovablePoint mb= new MovablePoint();
        System.out.println(mb);
        mb=new MovablePoint(5,6);
        System.out.println(mb);
        mb= new MovablePoint(5,5,6,7);
        System.out.println(mb);
        System.out.println(mb.move());

    }
}
