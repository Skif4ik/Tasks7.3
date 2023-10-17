package tasks3.model;

public abstract class Figure {

    public abstract double getPerimeter();
    public abstract double getSquare();

    public static double sumSquare (Figure[] figures){
        double sum = 0.0;
        for (Figure figure : figures) {
            sum += figure.getSquare();
        }
        return sum;
    }
}
