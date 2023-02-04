package FactoryMethodPattern;///**
// * Created by wgPark on 2023-01-30.
// */
//public abstract class PizzaStore {
//    SimplePizzaFactory factory;
//
//    abstract Pizza createPizza(String type);
//    abstract String descriptionPizza(String type);
//    public final Pizza orderPizza(String type){
//        Pizza pizza;
//
//        pizza = createPizza(type);
//
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
//
//        return pizza;
//    }
//}
