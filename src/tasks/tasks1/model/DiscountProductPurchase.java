package tasks.tasks1.model;

public class DiscountProductPurchase extends ProductPurchase{

    private static final double DISCOUNT = 0.10;

    public DiscountProductPurchase() {
    }

    public DiscountProductPurchase(String name, double price, int number) {
        super(name, price, number);
    }



    @Override
    public double getGeneralCost() {   //сумма покупки с учетом скидки
        double res = super.getGeneralCost() * (1 - DISCOUNT);
        return res;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DiscountProductPurchase{");
        sb.append("generalCost=").append(getGeneralCost());
        sb.append(", name='").append(getName()).append('\'');
        sb.append(", price=").append(getPrice());
        sb.append(", number=").append(getNumber());
        sb.append(", generalCost=").append(getGeneralCost());
        sb.append('}');
        return sb.toString();
    }
}
