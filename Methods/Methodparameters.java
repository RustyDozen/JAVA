public class Methodparameters {
    static void myMethod(String fname, String lname) {
        System.out.println("Hello " + fname + " " + lname);
    }
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You're not old enough");
        } else {
            System.out.println("You're old enough to drink");
        }
    }
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        myMethod("Sk", "Yeaman");
        checkAge(20);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum(num1, num2));
    }
}
