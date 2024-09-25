public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Tea", 1.5, 80);
        HotDrink coffee = new HotDrink("Coffee", 2.0, 90);

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        machine.addProduct(tea);
        machine.addProduct(coffee);

        machine.getProduct("Tea", 250, 80);   // Should succeed
        machine.getProduct("Coffee", 250, 90); // Should succeed
        machine.getProduct("Tea", 250, 90);    // Should fail
        machine.getProduct("Juice", 250, 80);  // Should fail
    }
}
