package com.company;

interface Bicycle{
    int b = 17;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int b = 17;
    void blowHorn1();
    void blowHornn();
    void blowHorn2();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("bado badi bado badi....");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Increasing speed");
    }
    public void blowHorn1(){
        System.out.println("May I come in");
    }

    @Override
    public void blowHornn() {
        System.out.println("mai edhar hi khada hai");
    }

    @Override
    public void blowHorn2() {
        System.out.println("are aa naa meri jaan...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        //cycle.applyBrake(15);
        //System.out.println(cycle.b);
        cycle.blowHorn1();
        cycle.blowHorn();
        cycle.applyBrake(45);
        cycle.blowHorn2();
    }
}
