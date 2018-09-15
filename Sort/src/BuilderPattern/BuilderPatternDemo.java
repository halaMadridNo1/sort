package BuilderPattern;

/**
 * Created by ${User} on 2018/9/16
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        System.out.println("Yeg Meal");
        meal.showItems();
        System.out.println("Total Cost: " +meal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
