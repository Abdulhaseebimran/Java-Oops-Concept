public class inherit {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Blue";
        
        System.out.println("Triangle color is " + t1.color);
    }
}

class Shape {
    String color;
}

class Triangle extends Shape {
// single level inheritance
}