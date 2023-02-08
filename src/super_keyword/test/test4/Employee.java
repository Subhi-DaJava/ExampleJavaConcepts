package super_keyword.test.test4;

import java.util.Arrays;

/**
 * Develop a class hierarchy of employees. The hierarchy should include three classes:
 * <p>
 * Employee is the base class. It includes three fields (name, email and integer variable experience),
 * one constructor with three arguments and three getters: getName(), getEmail(), getExperience().
 * Developer is a subclass. It includes fields from the base class and two additional fields (mainLanguage, skills),
 * one constructor with five arguments and two getters: getMainLanguage(), getSkills().
 * DataAnalyst is another subclass. It includes fields from the base class and two additional fields (phd, methods),
 * one constructor with five arguments and two getters: isPhd(), getMethods().
 * You need to define types of the fields and write suitable constructors. To understand it see the code below.
 * <p>
 * String[] skills = { "git", "Scala", "JBoss", "UML" };
 * Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);
 * <p>
 * String[] methods = { "neural networks", "decision tree", "bayesian algorithms" };
 * DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);
 */
public class Employee {
    public static void main(String[] args) {
        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Employee dev = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

        String[] methods = { "neural networks", "decision tree", "bayesian algorithms" };
        DataAnalyst dataAnalyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);

        System.out.println(dev.toString());
        System.out.println(dataAnalyst.toString());
    }

    // write fields
    protected String name;
    protected String email;
    protected int experience;

    // write constructor
    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    // write fields
    protected String mainLanguage;
    protected String[] skills;
    // write constructor

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills.clone();
    }

    // write getters

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills.clone();
    }

    // toString

    @Override
    public String toString() {
        return "Developer{" +
                "mainLanguage='" + mainLanguage + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", experience=" + experience +
                '}';
    }
}

class DataAnalyst extends Employee {

    // write fields
    protected boolean phd;
    protected String[] methods;

    // write constructor

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods.clone();
    }

    // write getters

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods.clone();
    }

    // toString

    @Override
    public String toString() {
        return "DataAnalyst{" +
                "phd=" + phd +
                ", methods=" + Arrays.toString(methods) +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", experience=" + experience +
                '}';
    }
}

