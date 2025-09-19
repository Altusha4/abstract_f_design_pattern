package aitu.coffee.maker;

import aitu.coffee.drink.Cappuccino;
import aitu.coffee.drink.Coffee;

public class CappuccinoMaker extends CoffeeMaker {
    @Override
    public Coffee createDrink() {
        return new Cappuccino();
    }
}
