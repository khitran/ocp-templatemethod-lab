package lab.assignment.beforerefactoring;

public class MochaCoffee extends CoffeeTemplate {
    @Override
    protected void addIngredients() {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouches() {
        System.out.println("Adding sugar");
    }
}