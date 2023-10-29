public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        Beverage coffee = cafe.makeBeverage("Coffee");
        Beverage tea = cafe.makeBeverage("Tea");

        coffee.make();
        tea.make();
    }
}