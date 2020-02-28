package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CappuccinoCoffee;
import lab.assignment.beforerefactoring.MochaCoffee;
import lab.assignment.beforerefactoring.AmericanoCoffee;
import lab.assignment.beforerefactoring.CoffeeTemplate;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new CappuccinoCoffee();

        //using template method
        coffeeType.prepareCoffee();
        System.out.println("************");

        coffeeType = new MochaCoffee();
        coffeeType.prepareCoffee();

        System.out.println("************");

        coffeeType = new AmericanoCoffee();
        coffeeType.prepareCoffee();
    }
}
