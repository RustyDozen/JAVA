public class recursion {
    /*static int sum(int n) {
        if (n > 0) {
            return n * sum(n - 1);
        } else if (n == 0){
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int num = 4;
        System.out.println("Factorial of " + num + " is " + sum(num));
    }*/
   static int sum(int start, int end) {
    if (end > start) {
        return end + sum(start, end - 1);
    } else {
        return end;
    }
   }
   public static void main(String[] args) {
    int start = 2, end = 8;
    System.out.println("Sum of numbers between " + start + " and " + end + " is " + sum(start, end));
   }
}