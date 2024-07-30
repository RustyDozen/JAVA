
public class strings {

    public static void main(String[] args) {
        String greeting = "Hello World";
        String txt = "qwertyuiopasdfghjklzxcvbnm";
        String txt2 = "qwerty \"uiop\" asdfgh";
        String firstName = "Sk ";
        String lastName = "Yeaman";
        int num1 = 1, num2 = 2;
        int add = num1 + num2;
        System.out.println("The length of the string is " + txt.length());
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Lowercase: " + greeting.toLowerCase());
        System.out.println("The index of 'y' in " + txt + " is " + txt.indexOf("y"));
        System.out.println(firstName.concat(lastName));
        System.out.println("Add of " + num1 + " and " + num2 + " is " + add);
        /* \n - New Line
         * \r - Carriage Return
         * \t - Tab
         * \b - Backspace
         * \f - Form Feed */
    }
}
