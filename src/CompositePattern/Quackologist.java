package CompositePattern;

/**
 * Created by wgPark on 2023-02-20.
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽥꽥학자: "+duck+" 가 방금 소리 냈다.");
    }
}
