import java.time.LocalDate;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Person barista = new Person("Zeis", LocalDate.of(1985, 6, 12));
        System.out.println(barista);

        Person firstFloorNeighbor = new Person("Teresa", LocalDate.of(1973, 2, 21));
        System.out.println(firstFloorNeighbor);

        System.out.println("The oldest person is: " + whoIsOlder(barista, firstFloorNeighbor));

        ForceUser yoda = new ForceUser("Yoda", LocalDate.of(4000, 1, 1),null);
        ForceUser obiWan = new ForceUser("Obi-Wan Kenobi", LocalDate.of(4500, 2, 11), yoda);

        System.out.println(yoda);
        System.out.println(obiWan);

        Object masterFather;

        ForceUser darthVader = new ForceUser("Dart Vader", LocalDate.of(4700, 12, 1), obiWan);
        Jedi luke = new Jedi("Luke", LocalDate.of(4800, 12, 25), obiWan, "green");


        System.out.println("The oldest is: "  + whoIsOlder(yoda, luke));

       luke.sleep();
       Robot robot = new Robot("C3p8");

        ArrayList<Object> entities = new ArrayList<>();
        entities.add(luke);
        entities.add(robot);

        for (int i = 0; i < entities.size(); i++){
            if (entities.get(i)  instanceof Person) {
                System.out.println(i + ") Is a person");
            } else {
                System.out.println(i + ") is not a person");
            }
        }


        luke.charm(firstFloorNeighbor);
        luke.charm(robot);

        yoda.haveLunch("tofu");
        yoda.haveLunch("tofu", "kombucha");



    }


//    JAVADOCS: created using /***

    /***
     * Return the older person based on the dateOfBirth. If the same age, return null
     * @param person1 First person
     * @param person2 Second Person
     * @return The older person or null
     */
    public static Person whoIsOlder(Person person1, Person person2) {
        if (person1.getDateOfBirth().isBefore(person2.getDateOfBirth())){
            return person1;
        } else if (person2.getDateOfBirth().isBefore(person1.getDateOfBirth())){
            return person2;
        } else {
            return null;
        }
    }

    public static void whoIsTheMaster(ForceUser forceUser){
        System.out.println(forceUser.getMaster().getName());
    }
}
