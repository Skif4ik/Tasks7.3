package tasks2.model;

import java.util.Arrays;

public abstract class Employee {
    private final double EXPERIENCEMIN = 0.2; // стаж от 5-15= 20%
    private final double EXPERIENCEMAX = 0.4; // стаж от 15-25=40%
    private String name;
    private int experience;  // стаж
    private static double salary = 1000;   // одинаковое для всех!!!

    public Employee() {
    }

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        salary = salary;
    }

    public double calculatioBonExperience() {      // расчет  за стаж
        double bonusExperience = 0;
        if (experience >= 5 && experience < 15) {
            return bonusExperience = salary * EXPERIENCEMIN;
        } else if (experience >= 15 && experience <= 25) { // убрать цифры например min стаж для премии - вынести в Static поля
            return bonusExperience = salary * EXPERIENCEMAX;
        } else {
            return bonusExperience = 0;
        }
    }

    public abstract double calculationBonus(); //расчет премии
    //можно было сделать как в предыдущей задаче расчитать

    public double amountSalary() {  // расчет зарплаты
        double sum = 0;
        sum = salary + calculatioBonExperience() + calculationBonus();
        return sum;
    }

    public static double avgSalary(Employee[] employees) { //Вычислите среднюю зарплату по предприятию.
        double avgSalary = 0.0;
        for (Employee employee : employees) {
            avgSalary += employee.amountSalary();
        }
        return avgSalary /= employees.length;
    }

    public static Employee[] getEmployees(Employee[] employees) {
        Employee[] employeesExp = new Employee[employees.length];
        int index = 0;
        for (Employee employee : employees) {
            if (employee.experience >= 15 && employee.experience < 25) {
                employeesExp[index++] = employee;  // добавляем ссылку в новый объект
            }
        }
        employeesExp = Arrays.copyOf(employeesExp, index);
        return employeesExp;
    }
}
