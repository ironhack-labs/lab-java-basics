public class Intern extends Employee {

    //Constante de salario max
    private static final double MAX_SALARY = 20000;

    //Constructor
    //Se puede usar un ternario: condicion? valor cierto : valor falso
    /* super(name, age, gender, salary > MAX_SALARY ? MAX_SALARY : salary, id)
     * mas limpio
     * ya que el if no se usa dentro del super y hay que crear un metodo entonces
     * */
    public Intern(String name, int age, String gender, double salary, String id) {
        super(name, age, gender, validateSalary(salary), id);
    }

    //metodo para validad el maximo del salario
    private static double validateSalary(double salary){
        if(salary > MAX_SALARY){
            return MAX_SALARY;
        }else {
            return salary;
        }
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(validateSalary(salary));
    }
}
