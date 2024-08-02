
public class Whileloop {

    public static void main(String[] args) {
        /*int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Not Happy Birthday To Me");*/
        int dice = 6;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("Not Yatzy");
            } else {
                System.out.println("Yatzy!");
            }
            dice++;
        }
    }
}
