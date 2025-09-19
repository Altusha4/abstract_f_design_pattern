package aitu.coffee.order;

import aitu.coffee.addons.cup.Cup;
import aitu.coffee.addons.milk.Milk;
import aitu.coffee.addons.syrup.Syrup;
import aitu.coffee.drink.Coffee;

public class FinalCoffee {
    private final Coffee drink;
    private final Milk milk;
    private final Syrup syrup;
    private final Cup cup;

    public FinalCoffee(Coffee drink, Milk milk, Syrup syrup, Cup cup) {
        this.drink = drink;
        this.milk = milk;
        this.syrup = syrup;
        this.cup = cup;
    }

    @Override
    public String toString() {
        return drink.name() + " / " + milk.name() + " / " + syrup.name() + " / " + cup.name();
    }
}
