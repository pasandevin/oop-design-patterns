package observer;

public class WeatherStation {
    public static void main(String[] args) {

        //creating WeatherData object
        WeatherData weatherData = new WeatherData();

        //create displays and pass them the weatherData object
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //StatiscsDisplay statiscsDisplay = new StatiscsDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //simulate new weather measurements
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
