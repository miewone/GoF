package TemplateMethodPattern;

/**
 * Created by wgPark on 2023-02-08.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("물 끓");
    }
    abstract void brew();

    abstract void addCondiments();

    public void pourInCup(){
        System.out.println("커벵 따라");
    }
}
