package inheritance.pet_cat;

import java.time.LocalDateTime;
import java.util.Date;

public class Pet {
    private LocalDateTime birthDate;
    protected String name;

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
}
