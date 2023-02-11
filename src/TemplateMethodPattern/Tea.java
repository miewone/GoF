package TemplateMethodPattern;

import java.util.List;

/**
 * Created by wgPark on 2023-02-08.
 */
public class Tea extends CaffeineBeverage{

    List<String> tt = null;
    public void brew(){
        System.out.println("찻잎");
    }

    public void addCondiments(){
        System.out.println("레몬 추가");
    }


}
