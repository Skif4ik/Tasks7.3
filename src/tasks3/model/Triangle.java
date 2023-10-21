package tasks3.model;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }


    @Override
    public double getPerimeter() {
        double perT = 0;
        if (sideA + sideB > sideC || sideA + sideC > sideB || sideB + sideC > sideA) {
            perT = (sideA + sideB + sideC);
        } else {
            System.out.println("Такой треугольник не существует");
        }
        return perT;
    }

    @Override
    public double getSquare() {
        double halfPer = 0, result = 0;
        halfPer = getPerimeter()/2;
        result = Math.sqrt(halfPer * (halfPer - sideA) * (halfPer - sideB) * (halfPer - sideC));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sideA;
        result = 31 * result + sideB;
        result = 31 * result + sideC;
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", perimeter=" + getPerimeter() +
                ", square=" + getSquare() +
                '}';
    }
}
