package inheritance.referencing_subclass.example;

public class Manager extends Employee{
    protected String role;
    protected String group;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
