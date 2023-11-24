Observer Pattern
WeatherDataSubject Class:in this class we intrested  in weather data ,Where it contains Attributes: 
- observersList :it basically is ArrayList to keep WeatherDataObserver instances interested in updates.
- temperature and humidity: this is variables to store weather related data.
   addToListObserver : this function adds an observer to the list.
  removeObserver : this function removes an observer from the list.
  notifyObservers : this function it allows every registered observer to be notified and updated whenever there is a change in the weather data.
  setWeatherData : this function updates the weather data and notifies all observers
This class serves as the subject that observers, which implement the WeatherDataObserver interface, can subscribe to.

public interface WeatherDataObserver : It is a method used any class that intends to observe or receive updates about weather data,when any data update occurs, it will give notifications of new data and any class that wishes to be an observer of weather data changes needs to implement this interface.

 class StatisticsDisplay :this class, as it implements the WeatherDataObserver interface, can be registered with the WeatherDataSubject ,every time the data changes, it receives them and the statistics appear.
 class CurrentConditionsDisplay :when updates occur, this display will showcase the current weather conditions.
  * Decorator Pattern
Decorator Class : implements the WeatherDataObserver interface
protected WeatherDataObserver : This attribute holds a reference to the decorator being wrapped.
 public Decorator : it allows for dynamically adding behavior by passing different decorators.
 update : it delegates the update call to the stored decorator object, allowing the wrapped observer to handle the update.

Class - PrecipitationDecorator: This attribute stores precipitation data, presumably a string representing precipitation information.
