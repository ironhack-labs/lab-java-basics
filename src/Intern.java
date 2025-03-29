  class Intern extends Employee {
      public Intern(String name, int age, String position, int salary) {
          super(name, age, position, salary);
          setSalary(20000);

      }

      @Override
      public void setSalaryOfEmployee(int salary) {
          super.setSalaryOfEmployee(salary);
      }

     public void setSalary(int salary) {
          final int MAXINTERNSALARY = 20000;

          if (getSalaryOfEmployee()>MAXINTERNSALARY){
              System.out.println("Presentation "+getNameEmployee()+" age of "+getAge()+" in the "+getPositionEmployee()+
                      " has a salary "+ getSalaryOfEmployee()+" it is over the limit ");

          }else{
              System.out.println("Presentation "+getNameEmployee()+" age of "+getAge()+" in the "+getPositionEmployee()+
                      " has a salary "+ getSalaryOfEmployee()+" it is normal limit ");
              super.setSalaryOfEmployee(MAXINTERNSALARY);
          }

      }
  }
