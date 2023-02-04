package AdapterPattern;

/**
 * Created by wgPark on 2023-02-04.
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("골");
    }

    @Override
    public void fly() {
        System.out.println("난다요~");
    }
}
