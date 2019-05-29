package usjt_ccp3anmca_observer.display;

import usjt_ccp3anmca_observer.Display;

public class CurrentConditionDisplay extends Display {
    @Override
    public void display() {

    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("----- Condições Atuais -----");
        System.out.printf("Temp: %.0f, Hum: %.0f%%, Press: %.2f\n", temperature, humidity, pressure);
    }
}
