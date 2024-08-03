
public class Maths {

    public static void main(String[] args) {
        int num1 = 1, num2 = 2, num3 = 4, num4 = -1;
        float num5 = 1.1f;
        System.out.println("Max number between " + num1 + " and " + num2 + " is " + Math.max(num1, num2));
        System.out.println("Min number between " + num1 + " and " + num2 + " is " + Math.min(num1, num2));
        System.out.println("Square root of " + num3 + " is " + Math.sqrt(num3));
        System.out.println("Absolute value of " + num4 + " is " + Math.abs(num4));
        System.out.println("Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive): " + Math.random());
        // To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.println("Random number between 0 to 100 is " + randomNum);
    }
}
