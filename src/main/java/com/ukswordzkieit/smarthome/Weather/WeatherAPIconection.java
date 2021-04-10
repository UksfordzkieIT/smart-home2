package com.ukswordzkieit.smarthome.Weather;

import org.springframework.web.client.RestTemplate;

public class WeatherAPIconection {

    private static final String API_KEY = "8e5c4032b8734ccb8938c9e63e49605f";
    private RestTemplate restTemplate = new RestTemplate();

    public String GetWeather(String city){
        String weather = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}",
                String.class, city, API_KEY);
        return weather;
    }
}
