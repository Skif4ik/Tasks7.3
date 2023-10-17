package tasks3.model;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double getSquare() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Сircle{");
        sb.append("radius=").append(radius);
        sb.append(", perimeter=").append(getPerimeter());
        sb.append(", square=").append(getSquare());
        sb.append('}');
        return sb.toString();
    }
}
