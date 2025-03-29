public class Employee {

        // Private instance variables
        private int employeeId;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String jobTitle;
        private double salary;

        // Constructor
        public Employee(int employeeId, String firstName, String lastName, String email,
                        String phoneNumber, String jobTitle, double salary) {
            this.employeeId = employeeId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.jobTitle = jobTitle;
            setSalary(salary); // Using setter to apply validation
        }

        // Getter and Setter methods
        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary >= 0) {
                this.salary = salary;
            } else {
                throw new IllegalArgumentException("Salary must be non-negative.");
            }
        }

        // Behaviors
        public void work() {
            System.out.println(firstName + " " + lastName + " is working as a " + jobTitle + ".");
        }

        public double getAnnualSalary() {
            return salary * 12;
        }

        public void raiseSalary(double percentage) {
            if (percentage > 0) {
                salary += salary * (percentage / 100);
            } else {
                throw new IllegalArgumentException("Raise percentage must be positive.");
            }
        }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


