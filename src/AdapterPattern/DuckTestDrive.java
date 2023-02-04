package AdapterPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);


    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
