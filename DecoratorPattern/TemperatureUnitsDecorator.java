package DecoratorPattern;

import Observer.WeatherDataObserver;

public class TemperatureUnitsDecorator extends Decorator {
    public TemperatureUnitsDecorator(WeatherDataObserver decoratedObserver) {
        super(decoratedObserver);
    }

    @Override
    public void update(float temperature, float humidity) {

        float newTemp = (temperature * 9 / 5) + 32;

        System.out.println("Temperature = " + newTemp + " Fahrenheit");


        super.update(temperature, humidity);
    }
}