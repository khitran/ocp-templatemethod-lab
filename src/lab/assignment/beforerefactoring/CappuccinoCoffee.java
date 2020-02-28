package lab.assignment.beforerefactoring;

public class CappuccinoCoffee extends CoffeeTemplate {
    @Override
    protected void addIngredients() {
		System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    @Override
    protected void finalTouches() {
    	System.out.println("Top with milk foam");
    }
