package org.example;

import java.util.Scanner;

public class Tester {
    public Void test(){
        Scanner input = new Scanner(System.in);
        Planet earth = Planet.earth;

        System.out.println("what planet to check");
        String planet = input.next();

        System.out.println(earth.getall(planet));


        System.out.println("enter weight");
        int weight = input.nextInt();

        System.out.println(earth.getweight(weight));
        return null;
    }
}
