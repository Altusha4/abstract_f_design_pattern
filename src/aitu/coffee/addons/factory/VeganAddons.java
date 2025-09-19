package aitu.coffee.addons.factory;

import aitu.coffee.addons.AddonsFactory;
import aitu.coffee.addons.cup.Cup;
import aitu.coffee.addons.cup.ReusableCup;
import aitu.coffee.addons.milk.Milk;
import aitu.coffee.addons.milk.SoyMilk;
import aitu.coffee.addons.syrup.Syrup;
import aitu.coffee.addons.syrup.VanillaSyrup;

public class VeganAddons implements AddonsFactory {
    @Override public Milk  createMilk()  { return new SoyMilk(); }
    @Override public Syrup createSyrup() { return new VanillaSyrup(); }
    @Override public Cup   createCup()   { return new ReusableCup(); }
}
