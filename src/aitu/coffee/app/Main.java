package aitu.coffee.app;
import aitu.coffee.addons.factory.ClassicAddons;
import aitu.coffee.addons.factory.PremiumAddons;
import aitu.coffee.addons.factory.VeganAddons;
import aitu.coffee.maker.CappuccinoMaker;
import aitu.coffee.maker.EspressoMaker;
import aitu.coffee.maker.LatteMaker;
import aitu.coffee.order.CoffeeOrderService;
import aitu.coffee.order.FinalCoffee;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderService service = new CoffeeOrderService();

        FinalCoffee order1 = service.makeOrder(new EspressoMaker(),   new ClassicAddons());
        FinalCoffee order2 = service.makeOrder(new LatteMaker(),      new VeganAddons());
        FinalCoffee order3 = service.makeOrder(new CappuccinoMaker(), new PremiumAddons());

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}
