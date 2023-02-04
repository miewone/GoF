
import Fly.FlyBehavior;
import QuackPck.QuackBehavior;

public abstract class Duck{
      QuackBehavior quackBehavior;
      FlyBehavior flyBehavior;
      
      public Duck() {}

      public void performQuack(){
            quackBehavior.quack();
      }
      
      public void performFly(){
            flyBehavior.fly();
      }

      public void setFlyBehavior(FlyBehavior fb){
            flyBehavior = fb;
      }

      public void setQuackBehavior(QuackBehavior qb){
            quackBehavior = qb;
      }
      public void swim(){
            System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죵");
      }

      public abstract void display();

}

