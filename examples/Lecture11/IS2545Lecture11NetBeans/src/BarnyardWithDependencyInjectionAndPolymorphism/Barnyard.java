/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarnyardWithDependencyInjectionAndPolymorphism;

import java.util.ArrayList;

/**
 *
 * @author AsphaltPanthers
 */
public class Barnyard {
    private final ArrayList<IAnimal> _animals;
    
    public Barnyard(ArrayList<IAnimal> animals) {
        _animals = animals;
    }
    
    public String makeNoise() {
        String noise = "";
        for (IAnimal animal : _animals) {
            noise += animal.vocalize() + System.lineSeparator();
        }
        return noise;
    }
}
