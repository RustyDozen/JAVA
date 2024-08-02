
public class Booleans {

    public static void main(String[] args) {
        boolean amIgay = false;
        boolean amIstraight = true;
        int myAge = 18;
        int votingAge = 18;
        System.out.println("Am I gay: " + amIgay);
        System.out.println("Am I straight: " + amIstraight);
        if (myAge == votingAge) {
            System.out.println("I am eligible to vote");
        } else {
            System.out.println("Not old enough");
        }
    }
}
