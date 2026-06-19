class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double rate;

    public Developer(String name, int id, double baseSalary, int overtimeHours, double rate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + overtimeHours * rate;
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Ram", 101, 50000, 10000),
            new Developer("Sita", 102, 40000, 10, 500)
        };

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " Salary: " + employee.calculateSalary());
        }
    }
}
