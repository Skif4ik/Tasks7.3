package task2.model;

public class Developer extends Employee {
    private static final double BONUS = 2.0;  // int

    public Developer() {
    }

    public Developer(String name, int experience) {
        super(name, experience);
    }

    @Override
    public double calculationBonus() {  //расчет премии
        return getSalary() * BONUS;
    }


    @Override
    public String toString() {
        return "Developer{" +
                ", name='" + getName() + '\'' +
                ", experience=" + getExperience() +
                ", calculationExperience=" + calculatioBonExperience() +
                ", calculationBonus=" + calculationBonus() +
                '}';
    }
}
