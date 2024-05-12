public class DeliverMeals implements OrderState {
    @Override
    public void selectDietaryAndTopping(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    @Override
    public void prepareMeals(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    @Override
    public void deliverMeals(CPPFoodDeliveryPlatform context) {
        Meal meal = context.getCurrentMeal();
        String toppingDescription = context.getTopping();  // Retrieve the selected topping description
        if (meal != null) {
            System.out.println("Delivering meal with the following components:");
            meal.displayComponents();  // Display all components of the meal
            displayDecoratedMeal(toppingDescription, context.getRestaurants().get(0).getMenu());
        } else {
            System.out.println("No meal is set for delivery.");
        }
        context.setState(null);  // Reset the state after delivery
    }

    // Method to display the decorated meal
    private void displayDecoratedMeal( String toppingDescription, Menu menu) {
        FoodItem topping = menu.getToppingByDescription(toppingDescription);
        if (topping != null) {
            System.out.println("With Topping: " + topping.describeTopping());
        } else {
            System.out.println("No toppings applied.");
        }
    }
}
