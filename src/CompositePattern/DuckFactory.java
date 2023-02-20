package CompositePattern;

/**
 * Created by wgPark on 2023-02-20.
 */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createGooseDuck() {
        return new DuckAdapter(new Goose());
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
