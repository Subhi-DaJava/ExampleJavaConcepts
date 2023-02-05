package inheritance.person_client_employee;

/**
 * the class Programmer has an array of the programming languages a programmer uses;
 */
public class ProgrammerSubclassFromEmployeeSuperClass extends EmployeeSubClassFromPersonTopSuperClass{
    protected String[] programmingLanguages;

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}
