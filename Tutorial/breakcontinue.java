
public class breakcontinue {

    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }*/
        int k = 0;
        /*while (k < 5) {
            System.out.println(k);
            k++;
            if (k == 3) {
                break;
            }
        }*/
        while (k < 5) {
            if (k == 3) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }
    }
}
