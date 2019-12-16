package csc.pract_min.factory;

public class SaladFactory {
    Salad makeSalad(String type) {
        if (type.equals("health")) {
            return new HealthSalad("fruit", "yogurt", "nuts");
        } else if (type.equals("harm")) {
            return new HarmSalad("fried pork", "mayonnaise", "fried potatoes");
        } else {
            throw new RuntimeException("Unknown salad + " + type);
        }
    }
}
