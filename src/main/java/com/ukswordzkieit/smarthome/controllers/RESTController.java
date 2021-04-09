package com.ukswordzkieit.smarthome.controllers;

import com.ukswordzkieit.smarthome.Weather.WeatherAPIconection;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RESTController
{
    @RequestMapping("/test")
    public String index() {
        String city = "Warszawa";
        WeatherAPIconection Api = new WeatherAPIconection();
        String weather = Api.GetWeather(city);
        return weather;
    }
}
