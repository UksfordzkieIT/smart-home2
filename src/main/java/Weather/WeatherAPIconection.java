package Weather;

import org.springframework.web.client.RestTemplate;

public class WeatherAPIconection {

    private RestTemplate restTemplate = new RestTemplate();

    private String GetWeather(String model, String grid, String coordinates, String field, String level, String date){
        String weather = restTemplate.getForObject(" https://api.meteo.pl/api/v1/model/{model}/grid/{grid}/coordinates/{coordinates}/field/{field}/level/{level}/date/{date}/forecast",
                String.class, model, grid, coordinates, field, level, date);
        return weather;
    }
}
