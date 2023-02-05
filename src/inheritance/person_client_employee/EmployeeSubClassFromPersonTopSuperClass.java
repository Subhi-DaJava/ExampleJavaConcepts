package inheritance.person_client_employee;

import java.time.LocalDateTime;

/**
 * the class Employee stores the start date of work for the company and the salary;
 */
public class EmployeeSubClassFromPersonTopSuperClass extends PersonTopSuperClass{
    protected LocalDateTime startDate;
    protected Long salary;

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
}
