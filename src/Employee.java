public class Employee {
        private String name;
        private int age;
        private double salary;
        private String position;

        public Employee(String name, int age, double salary, String position) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.position = position;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        public String getPosition() {
            return position;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public void printInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Position: " + position);
        }
    }
