package ObservePattern.Displaies;

import ObservePattern.WeatherData;
import ObservePattern.interfaces.DisplayElement;
import ObservePattern.interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayElement{
      private float temperature;
      private float humidity;
      private WeatherData weatherData;

      public StatisticsDisplay(WeatherData weatherData){
            this.weatherData = weatherData;
            weatherData.registerObserver(this);
      }

      public void update(){
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
      }

      public void display(){
            System.out.println("현재 날씨는 이렇게 변했습니다."+temperature );
      }
}