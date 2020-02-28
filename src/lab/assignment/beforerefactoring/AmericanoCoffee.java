package lab.assignment.beforerefactoring;

public class AmericanoCoffee extends CoffeeTemplate {
    @Override
    protected void addIngredients() {
        System.out.println("Add more hot water");
    }

    @Override
    protected void finalTouches() {
        System.out.println("Add sugar and cream");
    }
}