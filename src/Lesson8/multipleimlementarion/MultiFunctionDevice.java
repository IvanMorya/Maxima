package Lesson8.multipleimlementarion;

public class MultiFunctionDevice implements Printable, Scunnerable {

    private String a;
    String b;
    protected String c;

    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }

    @Override
    public String scan() {
        return "Scanned document.";
    }
}
