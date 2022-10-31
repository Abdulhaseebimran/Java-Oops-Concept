class Pens {
    String color;
    String type;  // boll pens or gel pens
    
    public void write () {
        System.out.println("Writing Something !");
    }

    public void printcolor () {
        System.out.println(this.color);
        // System.out.println(this.type);
    }
}

public class oops {
    public static void main(String[] args) {
     Pens Pen1 = new Pens(); 
     Pen1.color = "Blue";
     Pen1.type = "Gel pen";

    // Pen1.write();
    Pens Pen2 = new Pens();
    Pen2.color = "Black";
    Pen2.type = "BolL pen";

    Pen1.printcolor();
    Pen2.printcolor();


    }

} 