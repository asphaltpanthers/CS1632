/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarnyardWithDependencyInjection;

import BaryardWithDependencyInjection.Barnyard;
import BaryardWithDependencyInjection.Cow;
import BaryardWithDependencyInjection.Pig;
import BaryardWithDependencyInjection.Rooster;
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
        Cow mockCow = mock(Cow.class);
        when(mockCow.moo()).thenReturn("TestMoo");
        
        Pig mockPig = mock(Pig.class);
        when(mockPig.oink()).thenReturn("TestOink");
        
        Rooster mockRooster = mock(Rooster.class);
        when(mockRooster.crow()).thenReturn("TestCrow");
        
        Barnyard barnyard = new Barnyard(mockCow, mockPig, mockRooster);
        String noise = barnyard.makeNoise();
        
        Assert.assertEquals("TestMoo" + System.lineSeparator() + "TestOink" + System.lineSeparator() + "TestCrow", noise);
    }
}
