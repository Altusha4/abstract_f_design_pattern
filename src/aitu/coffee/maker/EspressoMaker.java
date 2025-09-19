package aitu.coffee.maker;

import aitu.coffee.drink.Coffee;
import aitu.coffee.drink.Espresso;

public class EspressoMaker extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Espresso();
    }
}
