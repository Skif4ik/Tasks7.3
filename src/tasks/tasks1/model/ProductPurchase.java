package tasks.tasks1.model;

public class ProductPurchase {
    private String name;
    private double price;
    private int number; //количество купленного товара

    public ProductPurchase() {
    }

    public ProductPurchase(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public double getGeneralCost() {//сумма покупки
        double res = price * number;
        return res;
    }

    public static double getFullGeneralCost(ProductPurchase[] p1) { // расчет общей суммы без скидки
        double fullGenCost = 0;
        for (ProductPurchase productPurchase : p1) {
            fullGenCost += productPurchase.price * productPurchase.number;
        }
        return fullGenCost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductPurchase{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", number=").append(number);
        sb.append(", generalCost=").append(getGeneralCost());
        sb.append('}');
        return sb.toString();
    }

    public static double calculationSummaDiscount(ProductPurchase[] p1) { // расчёт общей суммы со скидкой
        double sumDiscount = 0;
        for (ProductPurchase productPurchase : p1) {
            sumDiscount += productPurchase.getGeneralCost();
        }
        return sumDiscount;


    }


}
