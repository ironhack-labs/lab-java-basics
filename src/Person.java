import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

    public void haveLunch(String food){
        System.out.println(name + " is eating: " + food);
    }

    public void haveLunch(String food, String drink){
        haveLunch(food);
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping: zzz zzz");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
