package AdapterPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("꽥");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
