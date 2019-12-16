package csc.pract_min.decorator;

public class Main {
    public static void main(String[] args) {
        Ingredient bases = new Yougurt();
        Ingredient fruitSalad = new Fruit(bases);
        Ingredient nutFruitSalad = new Nut(fruitSalad);

        System.out.println(bases.cost());
        System.out.println(fruitSalad.cost());
        System.out.println(nutFruitSalad.cost());

        Ingredient moreNut = new Nut(new Nut(new Nut(new Nut(fruitSalad))));
        System.out.println("More nut");
        System.out.println(moreNut.cost());
    }
}
