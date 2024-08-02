public class Typecasting {
    public static void main(String[] args) {
        int myInt1 = 1;
        double myDouble1 = myInt1;
        System.out.println(myDouble1);
        double myDouble2 = 1.2d;
        int myInt2 = (int) myDouble2;
        System.out.println(myInt2);
        int maxScore = 500;
        int userScore = 423;
        float perc = (float) userScore / maxScore * 100.0f;
        System.out.println("User's percentage is " + perc + "%");
    }
}
