package aitu.coffee.addons;

import aitu.coffee.addons.cup.Cup;
import aitu.coffee.addons.milk.Milk;
import aitu.coffee.addons.syrup.Syrup;

public interface AddonsFactory {
    Milk  createMilk();
    Syrup createSyrup();
    Cup   createCup();
}
