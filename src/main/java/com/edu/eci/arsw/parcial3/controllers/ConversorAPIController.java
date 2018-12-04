/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.parcial3.controllers;

import com.edu.eci.arsw.parcial3.services.TemperatureConversorServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author estudiante
 */
//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value = "/conversor")
public class ConversorAPIController {
    
    @Autowired
    private TemperatureConversorServices tcs;
    
    @RequestMapping(method = RequestMethod.GET, path = "/fahrenheit/{f}")
    public ResponseEntity<?> handlerGetResourceFahrenheit(@PathVariable double f) {
        try {
            double c = tcs.FahrenheitToCelsius(f);
            return new ResponseEntity<>(c, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(ConversorAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/celsius/{c}")
    public ResponseEntity<?> handlerGetResourceCelsius(@PathVariable double c) {
        try {
            double f = tcs.CelsiusToFahrenheit(c);
            return new ResponseEntity<>(f, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(ConversorAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }
    
}
