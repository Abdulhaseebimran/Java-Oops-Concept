public class interfaces1 {
    public static void main(String[] args) {
        Horse1 horse = new Horse1();
        horse.walk();
    }
}

interface Animals {
    int eyes = 2;

    public void walk();
}

class Horse1 implements Animals {

    public void walk() {
        System.out.println(" walk on 4 leg's");
    }
}