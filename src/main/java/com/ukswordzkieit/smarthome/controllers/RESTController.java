package com.ukswordzkieit.smarthome.controllers;

import com.ukswordzkieit.smarthome.Weather.WeatherAPIconection;
import com.ukswordzkieit.smarthome.models.Battery;
import com.ukswordzkieit.smarthome.models.ThermoDriver;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RESTController
{
    ThermoDriver thermoDriver = new ThermoDriver();
    @RequestMapping("/test")
    public String index() {
        String city = "Warszawa";
        WeatherAPIconection Api = new WeatherAPIconection();
        String weather = Api.GetWeather(city);
        return weather;
    }

    @RequestMapping("/bateria")
    public Battery index2()
    {
        return  thermoDriver.getBattery();
    }

    @RequestMapping("/panele")
    public double index3()
    {
        return thermoDriver.getFotoVoltgeneratedOutput();
    }

    @RequestMapping("/pogoda")
    public String index4()
    {
        WeatherAPIconection weatherAPIconection = new WeatherAPIconection();
        return weatherAPIconection.GetWeather("warszawa");
    }

    
}
