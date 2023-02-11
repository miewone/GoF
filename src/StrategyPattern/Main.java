package StrategyPattern;

import StrategyPattern.Duck;
import StrategyPattern.Fly.FlyNoWay;
import StrategyPattern.Fly.*;
import StrategyPattern.QuackPck.*;

public class Main {
      public static void main(String[] args){
            Duck mallard = new MallardDuck();
            mallard.performFly();
            mallard.performQuack();
            
            Duck model = new ModelDuck();
            model.performFly();
            System.out.println("[UPDATE] MODEL DUCK FLY MODE CHAGNED!");
            model.setFlyBehavior(new FlyRocketPowered());
            model.performFly();
      }
}

class MallardDuck extends Duck{
      public MallardDuck(){
            quackBehavior = new Squeak();
            flyBehavior = new FlyNoWay();
      }

      public void display(){
            System.out.println("저는 물오리입니다");
      }
}

class ModelDuck extends Duck{
      public ModelDuck(){
            quackBehavior = new Squeak();
            flyBehavior = new FlyNoWay();
      }

      public void display(){
            System.out.println("저는 모델 오리입니다");
      }
}

class HunterDuck {
      public HunterDuck(){

      }
}