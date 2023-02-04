package FactoryMethodPattern;

/**
 * Created by wgPark on 2023-01-30.
 */
public class ChicagoStyleChessePizza extends Pizza {
    public ChicagoStyleChessePizza(){
        name = "시카고 치즈 피자";
        dough = "크러스트 도우";
        sauce = "플럼 토마토 소스";

        toppings.add("모짜렐라 치즈");
    }

    void cut(){
        System.out.println("네모난 모양으로 자르기");
    }
}
