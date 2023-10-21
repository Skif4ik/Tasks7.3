package tasks3.model;

public abstract class Figure {

    public abstract double getPerimeter();
    public abstract double getSquare();


    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Figure)) return false;

        Figure figure = (Figure) obj;

        final double EPS = 0.001;
        return (Math.abs(getSquare() - figure.getSquare()) <EPS);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static double sumSquare (Figure[] figures){
        double sum = 0.0;
        for (Figure figure : figures) {
            sum += figure.getSquare();
        }
        return sum;
    }
}
