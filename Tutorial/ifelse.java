
public class ifelse {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is smaller than " + num2);
        }
        String result = (num1 < num2) ? num1 + " is smaller than " + num2 : num1 + " is greater than " + num2;
        System.out.println(result);
    }
}
