package csc.pract_min.decorator;

public class Nut implements Ingredient {
    private final Ingredient baseIngredient;

    public Nut(Ingredient baseIngredient) {
        this.baseIngredient = baseIngredient;
    }

    @Override
    public int cost() {
        return 4 + baseIngredient.cost();
    }
}
