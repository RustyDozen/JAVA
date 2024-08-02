public class Scope {
    public static void main(String[] args) {
        // Code here CAN'T use x
        {
            // Code here CAN'T use x
            int x = 9;
            // Code here CAN use x
            System.out.println(x);
        } // The block ends here
        // Code here CAN'T use x
    }
}
