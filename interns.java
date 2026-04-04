public class Interns {

    public static void main(String[] args) {

        Intern[] interns = new Intern[10];

        for (int i = 0; i < interns.length; i++) {

            double salary = 15000 + (i * 3000);

            interns[i] = new Intern(
                    "Intern" + i,
                    i,
                    salary,
                    "Department" + i
            );
        }

        for (Intern intern : interns) {
            intern.displayEmployee();
        }
    }
}