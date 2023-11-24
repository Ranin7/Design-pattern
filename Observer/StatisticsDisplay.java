package Observer;
public class StatisticsDisplay implements WeatherDataObserver {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Statistics:\n");
        System.out.println("Average Temperature " + temperature);
        System.out.println("Average Humidity " + humidity);
    }
}