package csc.pract_min.observer;

public class Main {
    public static void main(String[] args) {
        Observable captain = new Captain();
        Observer player1 = new Player1();
        Observer player2 = new Player2();

        captain.registerObserver(player1);
        captain.registerObserver(player2);
        captain.notifyObserver("Player2 is bad now. Kick him");

        System.out.println("************************************");
        captain.removeObserver(player2);
        captain.notifyObserver("That's better");
    }
}
