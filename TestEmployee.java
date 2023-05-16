class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String toString() {
        return firstName + " " + lastName + "\nSocial Security Number: " + socialSecurityNumber;
    }

    public double earnings() {
        return 0.0;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public String toString() {
        return "Salaried Employee: " + super.toString() + "\nWeekly Salary: $" + String.format("%.2f", weeklySalary);
    }

    public double earnings() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public String toString() {
        return "Hourly Employee: " + super.toString() + "\nWage: $" + String.format("%.2f", wage) + "\nHours Worked: " + String.format("%.1f", hours);
    }

    public double earnings() {
        return wage * hours;
    }
}

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String toString() {
        return "Commission Employee: " + super.toString() + "\nGross Sales: $" + String.format("%.2f", grossSales) + "\nCommission Rate: " + String.format("%.2f", commissionRate);
    }

    public double earnings() {
        return grossSales * commissionRate;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public String toString() {
        return "Base Plus Commission Employee: " + super.toString() + "\nBase Salary: $" + String.format("%.2f", baseSalary);
    }

    public double earnings() {
        return super.earnings() + baseSalary;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("John", "Doe", "111-11-1111", 800.00);
        employees[1] = new HourlyEmployee("Jane", "Doe", "222-22-2222", 16.75, 40);
        employees[2] = new CommissionEmployee("Bob", "Smith", "333-33-3333", 10000, 0.06);       
        employees[3] = new BasePlusCommissionEmployee("Boby", "Smitha", "323-33-3333", 50000, 0.03,5000);
        System.out.println(employees[0]);
        System.out.println();
        System.out.println(employees[1]);
        System.out.println();
        System.out.println(employees[2]);
        System.out.println();
        System.out.println(employees[3]);
}
}