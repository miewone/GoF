package DecoratorPattern;

public class Soy extends CondimentDecorator{
      public Soy(Beverage beverage){
            this.beverage = beverage;
            this.size = beverage.size;
      }

      public String getDescription(){
            return beverage.getDescription()+", 두유";
      }

      public double cost(){
            return beverage.cost() + .10;
      }


      
}