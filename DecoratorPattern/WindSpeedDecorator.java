package DecoratorPattern;
import Observer.WeatherDataObserver;

public class WindSpeedDecorator extends Decorator {
    public WindSpeedDecorator(WeatherDataObserver decorator) {
        super(decorator);
    }


    void prnitWinData(){
        System.out.println("wind = 35 k/m");
    }
    @Override

    public void update(float temperature, float humidity) {
        prnitWinData();
        super.update(temperature, humidity);
    }
}