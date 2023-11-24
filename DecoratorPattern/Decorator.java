package DecoratorPattern;

import Observer.WeatherDataObserver;

public abstract class Decorator implements WeatherDataObserver {

    protected WeatherDataObserver decorator;

    public Decorator(WeatherDataObserver decorator) {
        this.decorator = decorator;
    }

    @Override
    public void update(float temperature, float humidity) {

        decorator.update(temperature, humidity);
    }
}