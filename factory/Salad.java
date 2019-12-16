package csc.pract_min.factory;

public abstract class Salad {
    private String basis;
    private String sauce;
    private String topping;

    public Salad(String basis, String sauce, String topping) {
        this.basis = basis;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "basis='" + basis + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
