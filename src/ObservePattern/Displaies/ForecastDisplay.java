import ObservePattern.WeatherData;
import ObservePattern.interfaces.DisplayElement;
import ObservePattern.interfaces.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
      private WeatherData weatherData;
      private float currentPressure = 29.92f;
      private float lastPressure ;


      public ForecastDisplay(WeatherData weatherData){
            this.weatherData = weatherData;
            weatherData.registerObserver(this);
      }

      public void display(){

      }
      public void update(){
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
      }

}