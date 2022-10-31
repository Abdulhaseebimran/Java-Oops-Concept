public class modi1 {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.name = "ABDUL HASEEB";
        b1.accountName = "Hello";
        b1.email = "Haseeb@gmail.com";

        System.out.println(b1.email);

        b1.setPassword("Haseeb");
        System.out.println(b1.getPassword());
        // b1.getPassword();
        
    }
}

class Bank {
    public String name;
    protected String accountName;
    public String email;
    private String Passowrd;

    // getters and setters
    public String getPassword () {
        return this.Passowrd;
    }

    public void setPassword (String pass) {
        this.Passowrd = pass;
    }
}
