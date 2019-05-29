package usjt_ccp3anmca_observer;

import usjt_ccp3anmca_observer.display.CurrentConditionDisplay;
import usjt_ccp3anmca_observer.display.ForecastDisplay;
import usjt_ccp3anmca_observer.display.HeatIndexDisplay;
import usjt_ccp3anmca_observer.display.StatsDisplay;

public class Teste {
    public static void main(String[] args) {
        WeatherData estacaoMonitoramento = new WeatherData();
        CurrentConditionDisplay d1 = new CurrentConditionDisplay();
        StatsDisplay d2 = new StatsDisplay();
        ForecastDisplay d3 = new ForecastDisplay();
        HeatIndexDisplay d4 = new HeatIndexDisplay();
        estacaoMonitoramento.registerObserver(d1);
        estacaoMonitoramento.registerObserver(d2);
        estacaoMonitoramento.registerObserver(d3);
        estacaoMonitoramento.registerObserver(d4);
        estacaoMonitoramento.iniciar();
    }
}
