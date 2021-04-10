package com.ukswordzkieit.smarthome.controllers;

import com.ukswordzkieit.smarthome.Weather.WeatherAPIconection;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

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
