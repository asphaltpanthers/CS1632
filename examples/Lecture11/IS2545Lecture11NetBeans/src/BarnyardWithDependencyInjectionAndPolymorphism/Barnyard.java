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
    /*This is an example of an application with dependency injection and polymorphism. We still are injecting the dependencies as parameters,
         * but the parameter is a list of an abstract data type named IAnimal. IAnimal is an interface with one method that need overriding,
         * Vocalize(). This is an improvement for two reasons:
         * 
         * 1. Testability
         * 
         * Now when we create mocks (as seen in Barnyard.WithDependencyInjectionAndPolymorphism.Tests) we only need to create a mock for one data
         * type instead of three.
         * 
         * 2. Extensibility
         * 
         * With this implementation it becomes much easier to add animals to the barnyard. In fact, we can do it without making any changes to
         * this code. This code can support barnyards made up of any number or types of animals. This results in less code overhead and simpler,
         * easier to understand solutions that are better tested.
         */
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
