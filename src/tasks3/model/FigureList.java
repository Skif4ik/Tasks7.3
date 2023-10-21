package tasks3.model;



import java.util.Arrays;

public class FigureList {
    public static final int INITIAL_SIZE = 5;
    private Figure[] figures = new Figure[INITIAL_SIZE];// проинициализировали поле, чтобы не использовать конструктор
    private int currentIndex = 0; //контроль индекса

    public void add(Figure figure) { //добавлять фигуры
        if (figure != null) {
            if (currentIndex == figures.length) {// автоматически расширялся (увеличивался, создовался новый)
                figures = Arrays.copyOf(figures, figures.length * 2);
            }
            figures[currentIndex++] = figure;
        }
    }

    public void addFigures(Figure... outFigure) {// добавляет сразу много фигур сразу
        for (Figure figure : outFigure) {
            add(figure);
        }
    }

    public double sumSquare() {// расчет общей площади
        double sum = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            sum += figures[i].getSquare();
        }
        return sum;
    }

    public Figure getByIndex(int index) { // вернуть один объект, т.к. просто через индекс не можем обратиться в данном классе
        Figure figure = null;
        if (isVaLidIndex(index)) // проверка повторяется- поэтому сделали метод
            figure = figures[index];
        return figure;
    }

    public void delByIndex(int index) {// удаление по индексу
        if (isVaLidIndex(index)) { // проверка повторяется- поэтому сделали метод
            System.arraycopy(figures, index + 1, figures, index, currentIndex);
            currentIndex--;
        }
    }

    public Figure getFigureWithMaxPerimeter() {// что бы метод возвращал фигуру!!!!
        int indMax = 0;
        for (int i = 0; i < currentIndex - 1; i++) {
            if (figures[indMax].getPerimeter() < figures[i + 1].getPerimeter()) {
                indMax = i + 1;
            }
        }
        return figures[indMax];
    }

    private boolean isVaLidIndex(int index) {
        return index >= 0 && index < currentIndex;
    }

    public Figure getFigureWithMinPerimeter() {
        int indMin = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (figures[indMin].getPerimeter() > figures[i + 1].getPerimeter()) {
                indMin = i + 1;
            }
        }
        return figures[indMin];
    }

    public void allEquals(int index) {
        for (int i = 0; i < currentIndex; i++) {
            if (figures[index] != figures[i] && figures[index].equals(figures[i]))
                System.out.println(figures[i]);
        }
    }

    public void show() {// выводит массив
        System.out.println("===== Figure List =====");
        for (int i = 0; i < currentIndex; i++) { // форич не используем, т.к. не знаем точное кол-во фигур
            System.out.println(figures[i]);
        }
    }

}