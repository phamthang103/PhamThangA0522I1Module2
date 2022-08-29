package PhamThangA0522I1Module2.tuan6.interfac_resizeable;

import java.awt.*;

public class CircleTest {
    public static void main(String[] args) {
        Shape[]shapes=new Shape[3];
        shapes[0]=new Circle(1,"do",true);
        shapes[1] = new Rectangle("xx",true,2,3);
        shapes[2] = new Square("nn",true,10);
        for (Shape shape: shapes) {
            System.out.println(shape);
            System.out.println("----------------------------");
        }
        for (Shape shape: shapes) {
            if (shape instanceof Circle){
                ((Circle) shape).resizeable(Math.random()*100);
            } else if (shape instanceof Rectangle){
                ((Rectangle) shape).resizeable(Math.random()*100);
            } else {
                ((Square) shape).resizeable(Math.random()*100);
            }
        }
        System.out.println("-----------------------------");
        for (Shape shape : shapes){
            System.out.println(shape);
            System.out.println("-----------------------");;
        }
    }
}
