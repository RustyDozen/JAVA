abstract class Modifiers1 {
    public String fname = "Sk ";
    public String lname = "Yeaman";
    public int age = 18;

    public abstract void study();
}

class Student extends Modifiers1 {
    public int graduationYear = 2018;

    public void study() {
        System.out.println("Studying all day long");
    }
}