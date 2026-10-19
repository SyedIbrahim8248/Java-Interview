//public class _55Q {
//    Question: Write a Java program to initialize employee details using a constructor.

    class Employee {
        String name;
        int salary;

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }

        public static void main(String[] args) {
            Employee e = new Employee("Ibrahim", 300000);
            e.display();
        }
    }

