//Create an Intern class that extends from Employee. All the Interns have a salary limit of 20000 (constant).
//You must validate if an intern is created (or salary updated) with a bigger salary than the max. The max value is set.


public class Intern extends Employee{
    private static final double SALARY_LIMIT = 20000.0;

        public Intern(String name, boolean isRemote, double salary){
            super(name, isRemote, Math.min(salary, SALARY_LIMIT));
        }

        @Override
        public void setIsRemote(boolean isRemote){
            super.setIsRemote(false);
        }
    }
