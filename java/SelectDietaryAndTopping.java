public class SelectDietaryAndTopping implements OrderState {
    @Override
    public void selectDietaryAndTopping(CPPFoodDeliveryPlatform context) {
        context.setState(new PrepareMeals());
    }

    @Override
    public void prepareMeals(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }

    @Override
    public void deliverMeals(CPPFoodDeliveryPlatform context) {
        // Not applicable for this state
    }
}
