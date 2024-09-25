import java.util.HashMap;
import java.util.Map;

public class HotDrinkVendingMachine implements VendingMachine {
    private Map<String, HotDrink> inventory;

    public HotDrinkVendingMachine() {
        inventory = new HashMap<>();
    }

    public void addProduct(HotDrink drink) {
        inventory.put(drink.getName(), drink);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        HotDrink drink = inventory.get(name);
        if (drink != null && drink.getTemperature() == temperature) {
            System.out.println("Dispensing: " + drink);
            return drink;
        } else {
            System.out.println("Product not found or incorrect temperature.");
            return null;
        }
    }
}
