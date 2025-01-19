package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am constructor of Base2");
    }
    public void sayHello(){
        System.out.println("HELLO");
    }
    abstract public void greet();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am Pappa");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Child2 c = new Child2();



    }
}
