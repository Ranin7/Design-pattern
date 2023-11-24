package Observer;

public class CurrentConditionsDisplay implements WeatherDataObserver {
    @Override
    public void update(float temperature, float humidity) {

        System.out.println("current weather\n");
        System.out.println("Temperature = " + temperature);
        System.out.println("Humidity = " + humidity);

    }
}