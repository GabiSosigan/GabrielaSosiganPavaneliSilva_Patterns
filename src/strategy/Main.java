package strategy;

public class Main {
    public static void main(String[] args) {

        Cart cart1 = new Cart(200.0,  new NoDiscount());
        System.out.println("Total (sem desconto): " + cart1.total());

        cart1.setDiscountStrategy(new PercentageDiscount(10.0));
        System.out.println("Total (10%): " + cart1.total());

        cart1.setDiscountStrategy(new FixedDiscount(20.0));
        System.out.println("Total (-20): " + cart1.total());
    }
}
