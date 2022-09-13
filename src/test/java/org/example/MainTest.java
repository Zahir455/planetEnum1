package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {


    @Test
            public void testname1() {
        Planet planet = Planet.earth;
        Assertions.assertTrue(planet.getName() == ("Earth"));
    }

    @Test
            public void testname2() {
        Planet planet = Planet.earth;
        Assertions.assertTrue((planet.getName()).equals("Earth"));
    }

    @Test
    public void testMass() {
        Planet planet = Planet.earth;
        Assertions.assertTrue(planet.getMass() == 5.97 * Math.pow(10,24));
    }

    @Test
    public void testNoWeight() {
        Planet planet = Planet.earth;
        Assertions.assertTrue(planet.getweight(0).equals("The weight of that on planet Earth would be 0.0"));
    }

    @Test
    public void testInvalidPlanetName() {
        Planet planet = Planet.earth;
        Assertions.assertTrue(planet.getall("bubbles").equals("bubbles isn't a valid input"));
    }

    @Test
    public void testAllCapsPlanetName() {
        Planet planet = Planet.earth;
        Assertions.assertTrue(planet.getall("EARTH").equals("Name: Earth\n" +
                "Average distance from the sun: 1.0\n" +
                "Mass: 5.969999999999999E24\n" +
                "RMI: 1.0"));
    }
}