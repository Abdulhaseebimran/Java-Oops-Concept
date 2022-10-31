
public class poly1 {
    public static void main(String[] args) {
        Studentss s1 = new Studentss();
        s1.name = "Haseeb";
        s1.age = 20;

        s1.printInfo(s1.name, s1.age);
    }
}

class Studentss{
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + "\n " + age);
    }
}
