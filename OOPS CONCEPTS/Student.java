// import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Students s1 = new Students("Abdul haseeb", 20, "009");
        // Scanner sc = new Scanner(System.in);
        // s1.name = "ABDUL HASEEB";
        // s1.age = 20;
        // s1.roll_name = "CSC-22s-009";
        s1.PrintInfo();
        
    }
}

class Students {
    String name;
    int age;
    String roll_no;

    public void PrintInfo (){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll_no);
    }

    Students (String name, int age, String roll_no) {
     this.name = name;
     this.age = age;
     this.roll_no = roll_no;
    }
}
