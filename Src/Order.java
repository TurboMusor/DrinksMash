import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<DrinksMachine, Integer> orderItems = new HashMap<>();

    public void addDrink(DrinksMachine drink, int quantity) {
        orderItems.put(drink, orderItems.getOrDefault(drink, 0) + quantity);
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Map.Entry<DrinksMachine, Integer> entry : orderItems.entrySet()) {
            DrinksMachine drink = entry.getKey();
            int quantity = entry.getValue();
            double price = 0.0;

            switch (drink) {
                case COFFEE:
                    price = Drinks.COFFEE_PRICE;
                    break;
                case TEA:
                    price = Drinks.TEA_PRICE;
                    break;
                case LEMONADE:
                    price = Drinks.LEMONADE_PRICE;
                    break;
                case MOJITO:
                    price = Drinks.MOJITO_PRICE;
                    break;
                case MINERAL_WATER:
                    price = Drinks.MINERAL_WATER_PRICE;
                    break;
                case COCA_COLA:
                    price = Drinks.COCA_COLA_PRICE;
                    break;
            }

            totalCost += price * quantity;
        }
        return totalCost;
    }

    public void printOrderSummary() {
    }
}

