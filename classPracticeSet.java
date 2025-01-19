package com.company;

class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;

    }
}
class cellphone{
    public void ringing(){
        System.out.println("Ringing....");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Harsh...");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return  4*side;
    }
}
class Rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return (l+b)*2;
    }
}
class Circle{
    float r;
    public double area(){
        return 3.14*r*r;
    }
    public double perimeter(){
        return 2*3.14*r;
    }
}
class Player{
    public void hit(){
        System.out.println("Hitting th enemy");
    }
    public void run(){
        System.out.println("Running the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
}
public class classPracticeSet {
    public static void main(String[] args) {
        /*
        //problem 1
        Employee1 rohit = new Employee1();
        rohit.setName("Rohit");
        System.out.println(rohit.getName());
        rohit.salary=3400;
        System.out.println(rohit.getSalary());

        //Problem 3
        cellphone asus = new cellphone();
        asus.callFriend();
        asus.vibrating();
        asus.ringing();


        // problem3
        System.out.println("for square: ");
        Square rp = new Square();
        rp.side = 4;
        System.out.println(rp.area());
        System.out.println(rp.perimeter());

        //Problem 4
        System.out.println("for rectangle: ");
        Rectangle ab = new Rectangle();
        ab.l=2;
        ab.b=4;
        System.out.println(ab.area());
        System.out.println(ab.perimeter());

        //Problem 6

        Player tommy = new Player();
        tommy.hit();
        tommy.run();
        tommy.fire();

        System.out.println("for circle:" );
        Circle r = new Circle();
        r.r=4;
        System.out.println(r.area());
        System.out.println(r.perimeter());

         */





    }
}
