/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.parcial3.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author estudiante
 */
@Service
public class TemperatureConversorServices {
    
    public TemperatureConversorServices() {
        
    }
    
    public double CelsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }
    
    public double FahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }
    
}
