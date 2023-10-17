package tasks2.model;

public class Security extends Employee {
    private static final double BONUS = 0.1;

    public Security() {
    }

    public Security(String name, int experience) {
        super(name, experience);
    }


    @Override
    public double calculationBonus() {  //расчет премии
        return getSalary() * BONUS;
    }

    @Override
    public String toString() {
        return "Security{" +
                ", name='" + getName() + '\'' +
                ", experience=" + getExperience() +
                ", calculationExperience=" + calculatioBonExperience() +
                ", calculationBonus=" + calculationBonus() +
                '}';
    }

}
