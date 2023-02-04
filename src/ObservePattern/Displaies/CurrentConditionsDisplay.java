package ObservePattern.Displaies;

import ObservePattern.WeatherData;
import ObservePattern.interfaces.DisplayElement;
import ObservePattern.interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
      private float temperature;
      private float humidity;
      private WeatherData weatherData;

      public CurrentConditionsDisplay(WeatherData weatherData){
            this.weatherData = weatherData;
            weatherData.registerObserver(this);
      }

      public void update(){
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
      }

      public void display(){
            System.out.println("Current State: Temperature"+ temperature +"C, humidity "+humidity+"%");
      }
}