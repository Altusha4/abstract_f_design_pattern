package aitu.coffee.maker;

import aitu.coffee.drink.Coffee;
import aitu.coffee.drink.Latte;

public class LatteMaker extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Latte();
    }
}
