import java.util.ArrayList;
public class Class1 {
    private String name;
    //Qui estendo la Classe2 alla Classe1 con l'array
    //e la formula add(){}
    private ArrayList <Class2> asd = new ArrayList<>();
    public void printWaglio() {
        for (int i = 0; i< asd.size();i++) {
            System.out.println(asd.get(i));
        }
    }
    //la formula add(){}
    public void addClass(Class2 class2){
        asd.add(class2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class1(String name) {
        this.name = name;
    }

}
