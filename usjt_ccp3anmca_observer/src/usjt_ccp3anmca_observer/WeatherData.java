package usjt_ccp3anmca_observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject{

    private List<Observer> observers;

    public WeatherData() {
        observers = new LinkedList<>();
    }

    private double temperature;
    private double pressure;
    private double humidity;

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void iniciar() {
        Random gerator = new Random();
        while (true) {
            temperature = 30 + gerator.nextDouble() * 5;
            humidity = 20 + gerator.nextDouble() * 55;
            pressure = 800 + gerator.nextDouble() * 400;
            measurementsChanged();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}