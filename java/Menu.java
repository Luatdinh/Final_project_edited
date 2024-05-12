import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<FoodItem> toppings;

    public Menu() {
        this.toppings = new ArrayList<>();
        initializeDefaultToppings();
    }

    private void initializeDefaultToppings() {
        toppings.add(new Tomato());
        toppings.add(new Pickle());
        toppings.add(new Sauce());
    }

    public void addTopping(FoodItem topping) {
        if (topping != null && !toppings.contains(topping)) {
            toppings.add(topping);
            System.out.println("Topping added: " + topping.describeTopping());
        }
    }

    public FoodItem getToppingByDescription(String description) {
        for (FoodItem topping : toppings) {
            if (topping.describeTopping().equalsIgnoreCase(description)) {
                return topping;
            }
        }
        return null;
    }

}
