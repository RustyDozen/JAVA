public class Classattributes {
    int x = 9, age = 18;
    String fname = "Sk ", lname = "Yeaman";
    public static void main(String[] args) {
        Classattributes myObj1 = new Classattributes();
        Classattributes myObj2 = new Classattributes();
        myObj2.x = 7;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        System.out.println("My name is " + myObj1.fname + myObj1.lname + " and I am " + myObj1.age + " years old");
    }
}
