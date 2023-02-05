package inheritance.referencing_subclass.example;
/**
 * class has a default no-args constructor
 */

import java.time.LocalDateTime;

public class Employee extends Person {
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    protected LocalDateTime startDate;
    protected Long salary;
}
