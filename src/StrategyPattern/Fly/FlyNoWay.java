package Fly;

public class FlyNoWay implements FlyBehavior{
      @Override
      public void fly(){
            System.out.println("날지 못하다! 오리!");
      }
}