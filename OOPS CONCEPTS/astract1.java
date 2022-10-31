public class astract1 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();

        // Animal A1 = new Horse();
        // A1.breathe();
    }
}

abstract class Animal {
    abstract void walk();

    void breathe() {
        System.out.println("This animal breathes air");
    }

    // public void walk(){
    // System.out.println("Animal");
    // }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse can walk 4 leg's");
    }

}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken can walk on 2 leg's");
    }
}