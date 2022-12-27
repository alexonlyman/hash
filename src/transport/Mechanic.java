package transport;

import java.util.HashSet;
import java.util.Set;

public class Mechanic {
    private String name;
    private String qualification;
    private String car;
    Set<Mechanic> mechanics = new HashSet<>();

    public Mechanic(String name, String qualification, String car) {
        this.name = name;
        this.qualification = qualification;

        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
