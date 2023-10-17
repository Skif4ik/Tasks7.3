package task2;

import task2.model.Administrator;
import task2.model.Developer;
import task2.model.Employee;
import task2.model.Security;

public class Main2 {
    public static void main(String[] args) {
//2. Расчет зарплат по должностям
//2.1. Создайте класс Employee, отражающий информацию о сотруднике на фирме (имя,
//стаж, оклад - одинаковый для всех)
//2.2. Наследуйте от класса Employee ряд конкретных должностей c дополнительными
//премиями по контракту к окладу: Security(10%), Administrator(20%), Developer(200%) и
//т.д.
//2.3. Определите размер стажевой премии (процент от оклада), зависящей от стажа (до 5
//лет - нет премии, от 5 до 15 – 20%, от 15 до 25 – 40%)
//2.4. Зарплата по должностям начисляется в зависимости от оклада, стажа и премии.
//2.5. Создайте массив из 9 сотрудников (по три из каждой категории)
//2.6. Вычислите среднюю зарплату по предприятию.
//2.7. Создайте отдельный массив, хранящий информацию только о людях относящихся к
//стажевой категории (от 15 до 25 лет)

        Employee[] employees = {
                new Administrator("Vasya", 4),
                new Administrator("Masha", 5),
                new Security("Vitya", 20),
                new Developer("Ivan", 30),
                new Administrator("Dasha", 15),
                new Developer("Inna", 18),
        };

        // Инфо о сотрудниках
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Расчет зарплаты
        for (Employee employee : employees) {
            System.out.println(employee.amountSalary());
        }

        System.out.println("Средняя зарплата по предприятию: " + Employee.avgSalary(employees));

        Employee[] employees1 = Employee.getEmployees(employees);

        System.out.println("Сотрудники со стажем от 15 до 25 лет ");
        for (Employee employee : employees1) {
            System.out.println(employee);
        }
    }
}
