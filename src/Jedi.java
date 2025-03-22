import java.time.LocalDate;

public class Jedi extends ForceUser{
    private String swordColor;

    public String getSwordColor() {
        return swordColor;
    }

    public void setSwordColor(String swordColor) {
        this.swordColor = swordColor;
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " is sleeping. But whit open eyes");
    }

    public void charm(Person person) {
        System.out.println(person.getName() + " is charmed by " + super.getName());
    }

    public void charm(Robot robot) {
        System.out.println(robot.getModel() + " is controlled by " + super.getName());
    }


    public Jedi(String name, LocalDate dateOfBirth, ForceUser master, String swordColor) {
        super(name, dateOfBirth, master);
        this.swordColor = swordColor;
    }



}
