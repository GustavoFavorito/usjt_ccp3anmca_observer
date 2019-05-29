package usjt_ccp3anmca_observer.display;

import usjt_ccp3anmca_observer.Display;

import java.util.Random;

public class ForecastDisplay extends Display {
    private Random gerator = new Random();
    @Override
    public void display() {

    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        double previsao = temperature - 2 + gerator.nextDouble() * 4;
        System.out.println("----- Previsão para o próximo dia -----");
        System.out.printf("Previsões para o próximo dia: %.2f\n", previsao);
    }
}
