package FactoryMethodPattern;

/**
 * Created by wgPark on 2023-01-31.
 */
interface Product {
    void printName();
}

class ConcreteProductA implements Product {
    @Override
    public void printName() {
        System.out.println("You have created ConcreteProductA.");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void printName() {
        System.out.println("You have created ConcreteProductB.");
    }
}

abstract class Creator {
    abstract Product factoryMethod();

    void someOperation() {
        Product product = factoryMethod();
        product.printName();
    }
}

class ConcreteCreatorA extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator concreteCreatorA = new ConcreteCreatorA();
        concreteCreatorA.someOperation();

        Creator concreteCreatorB = new ConcreteCreatorB();
        concreteCreatorB.someOperation();
    }
}