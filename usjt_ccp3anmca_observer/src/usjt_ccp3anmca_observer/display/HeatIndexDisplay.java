package usjt_ccp3anmca_observer.display;

import usjt_ccp3anmca_observer.Display;

public class HeatIndexDisplay extends Display {

    @Override
    public void display() {

    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        double c1 = -8.78469475556;
        double c4 = -0.14611605;
        double c5 = -0.012308094;
        double c6 = -0.0164248277778;
        double c3 = 2.33854883889;
        double c2 = 1.61139411;
        double c7 = 0.002211732;
        double c8 = 0.00072546;
        double c9 = -0.000003582;

        double heatIndex = c1 + (c2*temperature) + (c3*humidity) + (c4 *temperature*humidity) +
                (c5 *(Math.pow(temperature, 2))) + (c6 *(Math.pow(humidity, 2))) + (c7 *(Math.pow(temperature, 2)*humidity))+
                (c8 *temperature*(Math.pow(humidity, 2))) + (c9 *(Math.pow(temperature, 2))*(Math.pow(humidity, 2)));

        System.out.println("----- Indice de Calor -----");
        System.out.printf("Indice de Calor: %.2f\n\n", heatIndex);
    }
}
