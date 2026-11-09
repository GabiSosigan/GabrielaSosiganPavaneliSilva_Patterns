package strategy;

public class Cart {
    private double subtotal;
    private DiscountStrategy strat;

    public Cart(double subtotal, DiscountStrategy strat) {
        this.subtotal = subtotal;
        this.strat = strat;
    }

    public void setDiscountStrategy(DiscountStrategy strat) {
        this.strat = strat;
    }

    public double total(){
        return strat.apply(subtotal);
    }
}
