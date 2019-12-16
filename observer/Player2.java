package csc.pract_min.observer;

public class Player2 implements Observer {
    @Override
    public void getInfo(String s) {
        System.out.println("I am player 2 : " + s);
    }
}
