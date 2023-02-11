package TemplateMethodPattern;

import java.util.AbstractList;

/**
 * Created by wgPark on 2023-02-08.
 */
public class Coffee extends CaffeineBeverage {

    public void brew() {
        System.out.println("필터 커피 우려");
    }

    @Override
    void addCondiments() {
        System.out.println("추가");
    }


}


