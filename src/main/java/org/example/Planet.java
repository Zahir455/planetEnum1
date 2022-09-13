package org.example;

public enum Planet {

    mercury("Mercury", 0.39, 0.33 * Math.pow(10,24), 0.38),
    venus("Venus",0.72 ,4.87 * Math.pow(10,24),0.91 ),
    earth("Earth",1 ,5.97 * Math.pow(10,24),1.00 ),
    mars("Mars",1.52 ,0.642 * Math.pow(10,24),0.38 ),
    jupiter("Jupiter",5.2 ,1898 * Math.pow(10,24),2.34 ),
    saturn("Saturn",9.54 ,568 * Math.pow(10,24),1.06 ),
    uranus("Uranus",19.2 ,86.8 * Math.pow(10,24),0.92 ),
    neptune("Neptune",30.06 ,102 * Math.pow(10,24),1.19 );

    private final String name;
    private final double averageDistanceFromSun;
    private final double mass;
    private final double relativeMassIndex;

    private Planet(String name, double averageDistanceFromSun, double mass, double relativeMassIndex){
        this.name = name;
        this.averageDistanceFromSun = averageDistanceFromSun;
        this.mass = mass;
        this.relativeMassIndex = relativeMassIndex;
    }


    public String getName() {
        return name;
    }

    public double getAverageDistanceFromSun() {
        return averageDistanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public double getRelativeMassIndex() {
        return relativeMassIndex;
    }

    public String getweight(double weight){
        String result;
        result = ("The weight of that on planet " + name + " would be " + weight*relativeMassIndex );
        return result;
    }

    public String getall(String planet){
        planet = planet.toLowerCase();
        String result;
        switch (planet) {
            case "mercury":
                result = ("Name: " + mercury.getName() + "\n"
                + "Average distance from the sun: " + mercury.getAverageDistanceFromSun() + "\n"
                + "Mass: " + mercury.getMass() + "\n"
                + "RMI: " + mercury.getRelativeMassIndex());
                break;
            case "venus":
                result = ("Name: " + venus.getName() + "\n"
                + "Average distance from the sun: " + venus.getAverageDistanceFromSun() + "\n"
                + "Mass: " + venus.getMass() + "\n"
                + "RMI: " + venus.getRelativeMassIndex());
                break;
            case "earth":
                result = ("Name: " + earth.getName() + "\n"
                + "Average distance from the sun: " + earth.getAverageDistanceFromSun() + "\n"
                + "Mass: " + earth.getMass() + "\n"
                + "RMI: " + earth.getRelativeMassIndex());
                break;
            case "mars":
                result = ("Name: " + mars.getName() + "\n"
                + "Average distance from the sun: " + mars.getAverageDistanceFromSun() + "\n"
                + "Mass: " + mars.getMass() + "\n"
                + "RMI: " + mars.getRelativeMassIndex());
                break;
            case "jupiter":
                result = ("Name: " + jupiter.getName() + "\n"
                + "Average distance from the sun: " + jupiter.getAverageDistanceFromSun() + "\n"
                + "Mass: " + jupiter.getMass() + "\n"
                + "RMI: " + jupiter.getRelativeMassIndex());
                break;
            case "saturn":
                result = ("Name: " + saturn.getName() + "\n"
                + "Average distance from the sun: " + saturn.getAverageDistanceFromSun() + "\n"
                + "Mass: " + saturn.getMass() + "\n"
                + "RMI: " + saturn.getRelativeMassIndex());
                break;
            case "uranus":
                result = ("Name: " + uranus.getName() + "\n"
                + "Average distance from the sun: " + uranus.getAverageDistanceFromSun() + "\n"
                + "Mass: " + uranus.getMass() + "\n"
                + "RMI: " + uranus.getRelativeMassIndex());
                break;
            case "neptune":
                result = ("Name: " + neptune.getName() + "\n"
                + "Average distance from the sun: " + neptune.getAverageDistanceFromSun() + "\n"
                + "Mass: " + neptune.getMass() + "\n"
                + "RMI: " + neptune.getRelativeMassIndex());
                break;
            default:
                result = (planet+" isn't a valid input");
        }
        return result;
    }
}


