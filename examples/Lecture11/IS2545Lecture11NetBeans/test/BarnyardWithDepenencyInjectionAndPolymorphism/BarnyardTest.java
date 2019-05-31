/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarnyardWithDepenencyInjectionAndPolymorphism;

import BarnyardWithDependencyInjectionAndPolymorphism.IAnimal;
import BarnyardWithDependencyInjectionAndPolymorphism.Barnyard;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author AsphaltPanthers
 */
public class BarnyardTest {
    @Test
    public void MakeNoiseTest() {
        //Create mock animal.
        IAnimal animal = mock(IAnimal.class);
        when(animal.vocalize()).thenReturn("TestNoise");
        
        //Create list of animals.
        ArrayList animals = new ArrayList();
        animals.add(animal);
        
        Barnyard barnyard = new Barnyard(animals);
        String noise = barnyard.makeNoise();
        
        Assert.assertEquals("TestNoise" + System.lineSeparator(), noise);
    }
}
