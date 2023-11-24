package DecoratorPattern;

import Observer.WeatherDataObserver;

public class PrecipitationDecorator extends Decorator {
    private String pre;

    public PrecipitationDecorator(WeatherDataObserver decoratedObserver, String pre) {
        super(decoratedObserver);
        this.pre = pre;
    }

    void precipitationData(){
        System.out.println("precipitation = " + pre);
    }

    @Override
    public void update(float temperature, float humidity) {
        precipitationData();
        super.update(temperature, humidity);
    }
}