package FactoryMethodPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public enum EnumSingleton {

    INSTANCE;

    int value;

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
}


public class EnumSingleton{
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
    }
}