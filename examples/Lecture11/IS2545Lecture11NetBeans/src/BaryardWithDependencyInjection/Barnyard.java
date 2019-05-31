/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaryardWithDependencyInjection;

/**
 *
 * @author AsphaltPanthers
 */
public class Barnyard {
    /*This is an example of an application with dependency injection. In this class, we inject the dependencies as parameters in the Barnyard
         * constructor. Now when we test this class, instead of testing with real animals, we can test with fake animals. Imagine if instead of
         * animals, the objects were things like database connections or API interfaces. We could design a fake database connection that returns
         * default values for our tests. We've now isolated our test to only test the method under test and there is no way for the test to fail
         * except for a bug in the method under test. See Barnyard.WithDependencyInjection.Tests for examples on how to mock
         * objects.
         */
    private final Cow _cow;
    private final Pig _pig;
    private final Rooster _rooster;
    
    public Barnyard(Cow cow, Pig pig, Rooster rooster) {
        _cow = cow;
        _pig = pig;
        _rooster = rooster;
    }
    
    public String makeNoise() {
        return _cow.moo() + System.lineSeparator() +
                _pig.oink() + System.lineSeparator() +
                _rooster.crow();
    }
}
