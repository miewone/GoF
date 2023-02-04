package ObservePattern;

import java.util.*;

import ObservePattern.interfaces.Observer;
import ObservePattern.interfaces.Subject;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature(){
        return this.temperature;
    }
    public float getHumidity(){
        return this.humidity;
    }
    public float getPressure(){
        return this.pressure;
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObserver(){
        for (Observer obs : observers){
            // obs.update(temperature, humidity, pressure);
            obs.update();
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurments(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
