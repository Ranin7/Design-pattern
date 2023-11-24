package Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject {

    private List<WeatherDataObserver> observersList = new ArrayList<>();
    private float temperature;
    private float humidity;

    public void addToListObserver(WeatherDataObserver observer) {

        observersList.add(observer);
    }

    public void removeObserver(WeatherDataObserver observer) {

        observersList.remove(observer);
    }

    public void notifyObservers() {
        for(int i=0;i<observersList.size();i++){
            observersList.get(i).update(temperature, humidity);
        }
    }

    public void setWeatherData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}