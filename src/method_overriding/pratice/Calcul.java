package method_overriding.pratice;

public class Calcul {
    public static void main(String[] args) {
        Programmer programmer = new Programmer(1500, 3);
        System.out.println("Salary of this programmer: " + programmer.calcSalary());
    }
}
class Employee {

    protected long baseSalary;

    public Employee(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public long calcSalary() {
        return baseSalary;
    }
}

class Programmer extends Employee {

    private int yearsOfExperience;

    public Programmer(long baseSalary, int yearsOfExperience) {
        super(baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    // overridden calcSalary
    @Override
    public long calcSalary() {
        return yearsOfExperience * 500 + super.baseSalary;
    }
}