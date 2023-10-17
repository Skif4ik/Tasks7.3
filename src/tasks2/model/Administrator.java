package tasks2.model;

public class Administrator extends Employee {
    private static final double BONUS = 0.2;

    public Administrator() {
    }

    public Administrator(String name, int experience) {
        super(name, experience);
    }

    @Override
    public double calculationBonus() {  //расчет премии
        return getSalary() * BONUS;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                ", name='" + getName() + '\'' +
                ", experience=" + getExperience() +
                ", calculationExperience=" + calculatioBonExperience() +
                ", calculationBonus=" + calculationBonus() +
                '}';
    }
}
