public class classess1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Haseeb";
        System.out.println(p1.name);

        // Person p2 = new Person();
        // p2.fatherName = "Imran";
        // System.out.println(p1.name + "father name is " + p2.fatherName);

        p1.walk();
        p1.eat();
    }
}

class Person {
    String name;
    int age;
    String fatherName;

    public void walk() {
        System.out.println(name + "  " + "is walking ");
    }

    public void eat () {
        System.out.println(name + " " + "is eating");
    }
}
