public class copy_constuct {
    public static void main(String[] args) {
        // Bache s1 = new Bache();
         Student s1 = new Student();
         s1.name = "ABDUL HASEEB";
         s1.age = 20;

        Student s2 = new Student(s1);
        s2.Information();
    }
}

class Student {
    String name;
    int age;

    public void Information (){
    System.out.println(this.name);
    System.out.println(this.age);

    }
    Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student () {

    }
}
