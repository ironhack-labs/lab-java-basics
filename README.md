![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Basics

<!-- Labs are mandatory and must be completed before the end of the next week.

You make work collaboratively with your classmates, but you may not copy and paste another student's code. -->

## Instructions

<!-- - Create a new GitHub repository named `Enterprise-Java-Development-1.01`
- Upload the code for all of the following prompts to your repository.
- Submit a URL link to your repository below. -->

1. Fork this repo.
2. Clone your fork to your local machine.
3. Solve the challenges.

## Deliverables

- Upon completion, add your solution to git.
- Then commit to git and push to your repo on GitHub.
- Make a pull request and paste the pull request link in the submission field in the Student Portal.

## Tasks

1. Write a method in Java to get the difference between the largest and smallest values in an array of integers. The length of the array must be **1 and above**. Use loops and conditionals to develop the algorithm.
2. Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console. Use loops and conditionals to develop the algorithm.
3. Create an `Employee` class to represent an employee of a company. Add all relevant properties and behaviors that you might need but you have to include a `salary` property. Don't forget to add getters and setters.
4. Create an `Intern` class that extends from `Employee`. All the Interns have a salary limit of 20000 (constant). You must validate if an intern is created (or salary updated) with a bigger salary than the max. The max value is set.
5. Write a program that creates 10 Employees and print it al the properties.

---

## Solution

### Project structure

```
src/
└── com/ironhack/
    ├── Main.java                  Entry point: runs every task and prints the results
    ├── arrays/
    │   └── ArrayUtils.java        Tasks 1 and 2 (array algorithms)
    └── employees/
        ├── Employee.java          Task 3 (properties, behaviours, getters and setters)
        └── Intern.java            Task 4 (salary capped at 20000)
```

### Where each task lives

| Task | Description | Implementation |
| ---- | ----------- | -------------- |
| 1 | Difference between the largest and the smallest value of an array | `ArrayUtils.differenceBetweenLargestAndSmallest(int[])` |
| 2 | Smallest and second smallest elements printed in the console | `ArrayUtils.printSmallestAndSecondSmallest(int[])` |
| 3 | `Employee` class with a `salary` property, getters and setters | `Employee` |
| 4 | `Intern` extending `Employee` with a salary limit of `20000` | `Intern` |
| 5 | Program that creates 10 employees and prints all their properties | `Main.runTaskFive()` |

### Design notes

- **No shortcuts in the algorithms.** Tasks 1 and 2 are solved with a single `for` loop and
  conditionals, as the lab asks, instead of `Arrays.sort` or the Stream API. Both run in O(n)
  time with O(1) extra memory.
- **Second smallest means second smallest *distinct* value.** For `[4, 1, 1, 9]` the program
  reports `1` and `4`. When every element is equal there is no second distinct value and the
  program says so rather than printing a misleading number.
- **One place for the salary rules.** `Employee` exposes a protected `validateSalary(double)`
  hook that is called from both the constructor and `setSalary`. `Intern` overrides it to add
  the `MAX_SALARY = 20000` limit, which covers the two cases the lab requires with a single
  override: an intern *created* above the limit and an intern *updated* above the limit. Raises
  are validated through the same path, so `raiseSalary` can never push an intern over the cap.
- **Fail fast on invalid data.** Ids must be positive, text fields cannot be blank and salaries
  cannot be negative. Invalid input throws `IllegalArgumentException` with a descriptive
  message, and the object keeps its previous valid state.

### How to run it

From the root of the repository, with a JDK installed:

```bash
javac -d out $(find src -name "*.java")
java -cp out com.ironhack.Main
```

On Windows PowerShell:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object FullName)
java -cp out com.ironhack.Main
```
