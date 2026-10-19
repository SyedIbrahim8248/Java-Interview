//public class _57Q {
//Question: Write a Java program to demonstrate multilevel inheritance.
class AnimaL {
    void eat() {
        System.out.println("Eating");
    }
}

class DoG extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

