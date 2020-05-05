package com.bit.demo3;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}
interface iFly {
    void fly();
}
interface iRun {
    void run();
}
interface iSwim {
    void swim();
}
class Cat extends Animal implements iRun {
    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }
    public Cat(String name) {
        super(name);
    }
}
class Frog extends Animal implements iRun,iSwim {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name+"正在游泳");
    }
}
public class TestDemo {
    public static void run(iRun iRun) {
        iRun.run();
    }
    public static void swim(iSwim iSwim) {
        iSwim.swim();
    }
    public static void fly(iFly iFly) {
        iFly.fly();
    }
    public static void main(String[] args) {
        Cat cat = new Cat("二三");
        run(cat);
        Frog frog = new Frog("三四");
        run(frog);
        swim(frog);
    }
}
