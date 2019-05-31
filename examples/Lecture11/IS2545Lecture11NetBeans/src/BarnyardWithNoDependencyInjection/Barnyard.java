/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarnyardWithNoDependencyInjection;

/**
 *
 * @author AsphaltPanthers
 */
public class Barnyard {
    /*This is an example of an application with no dependency injection. What if instead of a barnyard, this was a modern software application, and instead of
         * animals, the objects were things like database connections or API interfaces? There would be no way to test the MakeNoise() method without executing the
         * database or API interface code as well. This introduces a problem. If we are executing the database code and a test fails, it may have failed because
         * there was a bug in the database code or it may have failed because of unexpected data in the database. We only want our tests to fail if there is a bug in
         * the logic of the method under test.
         */
    private final Cow _cow = new Cow();
    private final Pig _pig = new Pig();
    private final Rooster _rooster = new Rooster();
    
    public String makeNoise() {
        return _cow.moo() + System.lineSeparator() +
                _pig.oink() + System.lineSeparator() +
                _rooster.crow() + System.lineSeparator();
    }
}
