package com.ukswordzkieit.smarthome.controllers;

import com.ukswordzkieit.smarthome.models.ThermoDriver;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
public class RESTController
{
    @RequestMapping("/test")
    public String index() {
        ThermoDriver thermoDriver = new ThermoDriver();
        thermoDriver.setHouseTemp(13.0);
        return Double.toString(thermoDriver.getHouseTemp());
    }
}
