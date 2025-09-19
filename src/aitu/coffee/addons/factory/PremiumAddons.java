package aitu.coffee.addons.factory;

import aitu.coffee.addons.AddonsFactory;
import aitu.coffee.addons.cup.Cup;
import aitu.coffee.addons.cup.PremiumCup;
import aitu.coffee.addons.milk.AlmondMilk;
import aitu.coffee.addons.milk.Milk;
import aitu.coffee.addons.syrup.NutSyrup;
import aitu.coffee.addons.syrup.Syrup;

public class PremiumAddons implements AddonsFactory {
    @Override public Milk  createMilk()  { return new AlmondMilk(); }
    @Override public Syrup createSyrup() { return new NutSyrup(); }
    @Override public Cup   createCup()   { return new PremiumCup(); }
}
