package csc.pract_min.builder;

public class BuilderExample {
    public static void main(String[] args) {
        Salad healthySalad = Salad.newBuilder()
                .setBasis("vegetables")
                .setSauce("yogurt")
                .setTopping("greenery")
                .build();

        Salad harmSalad = Salad.newBuilder()
                .setBasis("fat meat")
                .setSauce("mayonnaise")
                .setTopping("salami")
                .build();
    }

}

class Salad {
    private String basis;
    private String sauce;
    private String topping;

    private Salad() {
    }

    public String getBasis() {
        return basis;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    public static Builder newBuilder() {
        return new Salad().new Builder();
    }

    public class Builder {
        private Builder() {
        };

        public Builder setBasis(String basis) {
            Salad.this.basis = basis;
            return this;
        }

        public Builder setSauce(String sauce) {
            Salad.this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            Salad.this.topping = topping;
            return this;
        }

        public Salad build() {
            return Salad.this;
        }

    }
}
