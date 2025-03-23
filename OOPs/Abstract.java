abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
    void eat() {
        System.out.println("eats");
    }

    abstract void breathe();
}

class Horse extends Animal {
    void run() {
        System.out.println("running");
    }

    void breathe() {
        System.out.println("breathing");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
        h.breathe();
        h.eat();
    }
}
