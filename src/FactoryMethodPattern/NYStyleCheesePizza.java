package FactoryMethodPattern;

/**
 * Created by wgPark on 2023-01-30.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "뉴욕 치즈 피자";
        dough = "크러스터";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 레지아노 치즈");
    }
}
