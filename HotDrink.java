public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", HotDrink{" +
                "temperature=" + temperature +
                '}';
    }
}
