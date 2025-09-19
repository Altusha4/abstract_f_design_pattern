package aitu.coffee.order;

import aitu.coffee.addons.AddonsFactory;
import aitu.coffee.addons.cup.Cup;
import aitu.coffee.addons.milk.Milk;
import aitu.coffee.addons.syrup.Syrup;
import aitu.coffee.drink.Coffee;
import aitu.coffee.maker.CoffeeMaker;

public class CoffeeOrderService {
    public FinalCoffee makeOrder(CoffeeMaker maker, AddonsFactory addons) {
        Coffee drink = maker.createDrink();   // Factory Method
        Milk   milk  = addons.createMilk();   // Abstract Factory
        Syrup  syrup = addons.createSyrup();
        Cup    cup   = addons.createCup();
        return new FinalCoffee(drink, milk, syrup, cup);
    }
}
