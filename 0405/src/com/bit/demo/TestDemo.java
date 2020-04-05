package com.bit.demo;

abstract class Shape {
    public int a;
    public void func1() {

    }
    public abstract void draw();//抽象方法
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}
public class TestDemo {
    public static void func(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
