package tasks1;
//1. Покупка товара
//1.1. Создать класс ProductPurchase (name, price, number (количество купленного товара)).
//1.2. Определить в классе ProductPurchase параметрический конструктор
//1.3. Создать класс DiscountProductPurchase наследуемый от ProductPurchase (скидка в
//10%).
//1.4. Класс DiscountRedProductPurchase наследуемый от Purchase (скидка 50%).
//1.5. В каждом классе реализовать метод getGeneralCost(), который выводит сумму
//покупки.
//1.6. Реализовать конструкторы классов DiscountProductPurchase и
//DiscountRedProductPurchase через вызов конструктора класса ProductPurchase
//1.7. В установить get/set методы, переопределить метод toString();
//1.8. Создать массив, хранящий информацию о 6 покупках товаров
//1.9. Вывести полную информацию об объектах и сумме покупки getGeneralCost().
//1.10. Подчитать общую стоимость покупок без скидки и со скидками.

import tasks1.model.DiscountProductPurchase;
import tasks1.model.DiscountRedProductPurchase;
import tasks1.model.ProductPurchase;

public class Main1 {
    public static void main(String[] args) {

        ProductPurchase[] p1 = {

                new DiscountProductPurchase("Fridge", 4500, 4),
                new DiscountProductPurchase("TV", 1000, 3),
                new DiscountRedProductPurchase("FWashing machina", 1800, 1),
                new ProductPurchase("Dishwasher", 2500, 2),
                new DiscountRedProductPurchase("TV", 7500, 1),
                new ProductPurchase("TV", 5000, 2),
        };

        for (ProductPurchase productPurchase : p1) {
            System.out.println(productPurchase);  // показать имя класс
        }

        System.out.println("===================================================");
        System.out.println("Общая стоимость покупки без скидки: " + ProductPurchase.getFullGeneralCost(p1));
        System.out.println("===================================================");
        System.out.println("Общая стоимость покупки со скидкой: " + ProductPurchase.calculationSummaDiscount(p1));
        System.out.println("===================================================");

    }
}
