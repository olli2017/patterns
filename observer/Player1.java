package csc.pract_min.observer;

public class Player1 implements Observer{

    @Override
    public void getInfo(String s) {
        System.out.println("I am player 1 : " + s);
    }
}
