import java.time.LocalDate;

public class ForceUser extends Person{

    private ForceUser master;


    public ForceUser getMaster() {
        return master;
    }

    public void setMaster(ForceUser master) {
        this.master = master;
    }

    public ForceUser(String name, LocalDate dateOfBirth, ForceUser master) {
        super(name, dateOfBirth);
        this.master = master;
    }

    @Override
    public String toString() {
        return "ForceUser{" +
                "master=" + master +
                "} " + super.toString();
    }
}
