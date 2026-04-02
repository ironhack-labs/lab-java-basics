import java.util.ArrayList;

void main() {
  ArrayList<Employee> employees = new ArrayList<>();
  employees.add(new Employee(1,"John", "CFO", 15.5, 200000));
  employees.add(new Employee(2,"Amy", "CEO", 12.0, 300000));
  employees.add(new Employee(3,"Jose", "CTO", 9.0, 300000));
  employees.add(new Employee(4,"Jude", "PM", 7.5, 50000));
  employees.add(new Employee(5,"Emma", "SDE", 1.5, 35000));
  employees.add(new Employee(6,"Gala", "SDE", 5.5, 70000));
  employees.add(new Employee(7,"Uma", "QA", 2.5, 25000));
  employees.add(new Employee(8,"Alex", "CS", 1.5, 20000));
  employees.add(new Intern(9,"Maria", "SDE", 0.5, 22000));
  employees.add(new Intern(10,"Sean", "SDE", 0.5, 17000));

  for(Employee employee:employees){
    System.out.println(employee.getName()+ " has been " + employee.getJobTitle() + " for " + employee.getTenureYears() + " years and earns " + employee.getSalary() + " euros.");

  }

}

