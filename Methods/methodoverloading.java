public class methodoverloading {
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        System.out.println("Sum in Int: " + sum(1, 2));
        System.out.println("Sum in Double: " + sum(1.1, 1.2));
    }
}