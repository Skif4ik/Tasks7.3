package tasks3;

import tasks3.model.*;

//3. Площади и периметры фигур
//3.1 Создайте класс Figure.
//3.2 Создайте класс Rectangle, наследуемый от класса Figure.
//3.3 Дополните класс Rectangle необходимыми полями.
//3.4 Создайте класс Сircle, наследуемый от класса Figure.
//3.5 Дополните класс Circle необходимыми полями.
//3.6 Создайте класс Triangle, наследуемый от класса Figure.
//3.7 Дополните класс Triangle необходимыми полями.
//3.8 Создайте конструкторы и методы доступа к полям для всех классов.
//3.9 В классе Figure определитe метод getSquare() и getPerimeter(). В классах потомках
//переопределить методы getSquare() и getPerimeter(), возвращающие подсчитанные
//площадь и периметр.
//3.10 В классах должны быть переопределены методы toString(), hashCode() и equals()
//(equals - фигуры считаются одинаковыми, если их площади равны или равны с заданной
//точностью).
//3.11 Создайте массив фигур, состоящий из 9 фигур, по 3 на каждый класс.
//3.13 Используя цикл foreach, выведите информацию о каждом объекте (метод toString()).
//3.14 Найдите общую площадь всех фигур
//3.15 Найдите фигуры с минимальным и максимальным периметром
//3.16 Найти в массиве все фигуры, равные введённой (используя
//переопределённый метод equals)
public class Main3 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(4, 5),
                new Triangle(3, 4, 5),
                new Circle(3),
                new Rectangle(3, 2)
        };

        for (Figure figure : figures) {
            System.out.println(figure);
        }

        //второй и четвертый элементы массива считаются примерно  равными по площадям
        System.out.println(figures[1].equals(figures[3]));
        System.out.println(Figure.sumSquare(figures));

        System.out.println("==============================================");


        FigureList figureList = new FigureList();// создали новый объект
        figureList.add(new Circle(7));// добавили 1 фигуру
        figureList.addFigures(figures);// добавили уже существующий массив
        figureList.add(new Circle(9));// добавили еще фигуру
        figureList.show();
        System.out.println(figureList.sumSquare());// вызов метода
        figureList.allEquals(2);
       figureList.delByIndex(5);
        System.out.println(figureList.getByIndex(0)); // увидеть объект по заданному индексу
//
       figureList.getFigureWithMaxPerimeter();
        figureList.getFigureWithMinPerimeter();

    }
}
