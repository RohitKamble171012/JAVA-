package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("this is constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    public String ad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}

class dog extends Animal{
    public String bc;

    public String getBc() {
        return bc;
    }

    public void setBc(String bc) {
        this.bc = bc;
    }
}
public class Inheritance {
    public static void main(String[] args) {
       /* // creating object of base class
        Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());

        // creating the object of derived class
        Derived d = new Derived();
        d.setX(11);
        System.out.println(d.getX());

        Derived c = new Derived();
        c.setY(45);
        System.out.println(c.getY());
        */

        //creating object in animal class
        Animal b = new Animal();
        b.setAd("dog");
        System.out.println(b.getAd());

        //derived class
        dog a = new dog();
        a.setAd("cat");
        System.out.println(a.getAd());

    }
}
