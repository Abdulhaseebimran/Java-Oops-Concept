// multi level inheritance or  Hierarchical inheritance  example 
public class inheritance2 {
    public static void main(String[] args) {
     Circle t1 = new Circle();
     t1.area();
    }
}

class Shape1 {
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle1 extends Shape1 {
     public void area (int l, int h) {
      System.out.println(1/2*l*h);
     }
}

class Circle extends Shape1 {
    public void area (int r) {
        System.out.println((3.14)*r*r);
   }
}