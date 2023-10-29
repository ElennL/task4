public class Cafe {
    public Beverage makeBeverage(String beverageType) {
        if (beverageType.equalsIgnoreCase("Coffee")) {
            return new Coffee();
        }
        else if (beverageType.equalsIgnoreCase("Tea")) {
            return new Tea();
        }
        return null;
    }

}
