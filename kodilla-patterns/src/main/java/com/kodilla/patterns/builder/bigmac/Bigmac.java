package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (Arrays.asList("lettuce", "onions", "bacon", "cucumber").contains(ingredient)) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("There are no such additional ingredients.");
            }
        }

        public Bigmac build() {
            if (bun.isEmpty()) {
                throw new IllegalStateException("You must have a bun");
            }
            if (burgers <= 0 || burgers > 4) {
                throw new IllegalStateException("You have the wrong amount of burgers.");
            }

            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}

