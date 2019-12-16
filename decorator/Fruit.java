package csc.pract_min.decorator;

public class Fruit implements Ingredient{
    private final Ingredient baseIngredient;

    public Fruit(Ingredient baseIngredient) {
        this.baseIngredient = baseIngredient;
    }

    @Override
    public int cost() {
        return 3 + baseIngredient.cost();
    }
}
