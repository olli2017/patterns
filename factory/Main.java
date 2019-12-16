package csc.pract_min.factory;

public class Main {
    public static void main(String[] args) {
        SaladFactory factory = new SaladFactory();

        Salad healthSalad = factory.makeSalad("health");
        Salad harmSalad = factory.makeSalad("harm");

        System.out.println("I am health salad");
        System.out.println(healthSalad.toString());

        System.out.println("I am harm salad");
        System.out.println(harmSalad.toString());
    }
}
