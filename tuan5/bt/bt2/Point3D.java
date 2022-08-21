package tuan5.bt.bt2;

public class Point3D extends Point2D {
    private float z=1;
    public Point3D(){
    }
    public Point3D(float  x, float y,  float z){
        super(x,y);
        this.z=z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float  x, float y,  float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] getXYZ(){
        float[]  array={x,y,z};
        return array;
    }
    @Override
    public String toString(){
        return super.toString()+"z="+z;
    }

    public static void main(String[] args) {
        Point3D p3= new Point3D();
        System.out.println(p3);
        p3=  new Point3D(3,4,5);
        System.out.println(p3);
        float[] array=  p3.getXYZ();
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
