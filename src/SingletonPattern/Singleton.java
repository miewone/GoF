package SingletonPattern;

/**
 * Created by wgPark on 2023-02-01.
 */
public class Singleton {
    public static Singleton singleton;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton ==null){
            singleton = new Singleton();
        }

        return singleton;
    }
}

enum Singlebun{
    UNIQUE_SINGLE,
}
