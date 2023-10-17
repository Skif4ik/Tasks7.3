package tasks3.model;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle() {
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return ((sideA + sideB) * 2);
    }

    @Override
    public double getSquare() {
        return (sideA * sideB);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", perimeter=").append(getPerimeter());
        sb.append(", square=").append(getSquare());
        sb.append('}');
        return sb.toString();
    }
}
