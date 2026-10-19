//public class _54Q {
    //Question: Write a Java program to create a Student class with name and age. Create an object and display the details.
    class Student {
        String name = "Ibrahim";
        int age = 21;

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) {
            Student s = new Student();
            s.display();
        }
    }


