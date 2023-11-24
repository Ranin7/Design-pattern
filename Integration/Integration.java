package Integration;

import DecoratorPattern.PrecipitationDecorator;
import DecoratorPattern.TemperatureUnitsDecorator;
import DecoratorPattern.WindSpeedDecorator;
import Observer.CurrentConditionsDisplay;
import Observer.StatisticsDisplay;
import Observer.WeatherDataObserver;
import Observer.WeatherDataSubject;

public class Integration {
    public static void main(String[] args) {

        WeatherDataSubject subject = new WeatherDataSubject();
        WeatherDataObserver condition = new CurrentConditionsDisplay();

        WeatherDataObserver statistics = new StatisticsDisplay();
        WeatherDataObserver temp = new TemperatureUnitsDecorator(condition);


        float temperture1 = 20;
        float h1 = 44;

        float temperture2 = 15;
        float h2 = 60;

        String weather = "rain";

        WeatherDataObserver wind = new WindSpeedDecorator(temp);

        WeatherDataObserver precipitation = new PrecipitationDecorator(wind, weather);



        subject.addToListObserver(condition);
        subject.addToListObserver(statistics);
        subject.addToListObserver(temp);


        subject.setWeatherData(temperture1, h1);
        subject.addToListObserver(wind);
        subject.addToListObserver(precipitation);
        subject.setWeatherData(temperture2, h2);

        subject.removeObserver(condition);


        subject.removeObserver(wind);
        subject.removeObserver(precipitation);
        subject.removeObserver(statistics);



    }
}
