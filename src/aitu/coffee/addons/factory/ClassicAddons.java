package aitu.coffee.addons.factory;

import aitu.coffee.addons.AddonsFactory;
import aitu.coffee.addons.cup.Cup;
import aitu.coffee.addons.cup.DisposableCup;
import aitu.coffee.addons.milk.Milk;
import aitu.coffee.addons.milk.RegularMilk;
import aitu.coffee.addons.syrup.CaramelSyrup;
import aitu.coffee.addons.syrup.Syrup;

public class ClassicAddons implements AddonsFactory {
    @Override public Milk  createMilk()  { return new RegularMilk(); }
    @Override public Syrup createSyrup() { return new CaramelSyrup(); }
    @Override public Cup   createCup()   { return new DisposableCup(); }
}
