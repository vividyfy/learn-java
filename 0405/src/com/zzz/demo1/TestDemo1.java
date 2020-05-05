package com.bit.demo1;

import java.awt.*;

class Shape {
    public void draw() {

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("这是一个圆圈！");
    }
}
class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("这是一个矩形!");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("🔺");
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Shape[]  shapes = {new Cycle(),new Square(),new Triangle()};
        for (Shape shape : shapes){
            drawMap(shape);
        }
    }
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main1(String[] args) {
        Shape shape1 = new Cycle();
//        shape1.draw();
        Shape shape2 = new Square();
//        shape2.draw();
        drawMap(shape1);
        drawMap(shape2);
    }
}
