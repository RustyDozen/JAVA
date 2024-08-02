
public class Arrays {

    public static void main(String[] args) {
        /*String[] cars = {"AE86", "RX7", "R33"};
        cars[2] = "R34";
        System.out.println(cars[2]);
        System.out.println("Array length: " + cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        for (String i : cars) {
            System.out.println(i);
        }
        int[] ages = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        float sum = 0, avg;
        int length = ages.length;
        for (int i : ages) {
            sum += i;
        }
        avg = sum / length;
        System.out.println("Average: " + avg);*/
 /*int[] ages = {24, 12, 15, 18, 20, 19, 10};
        int lowestAge = ages[0];
        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array: " + lowestAge);
        for (int age = 0; age < ages.length; age++) {
            if (lowestAge > ages[age]) {
                lowestAge = ages[age];
            }
        }
        System.out.println("The lowest age in the array: " + lowestAge);*/
        int[][] myNum = {{1, 2, 3}, {4, 5, 6}};
        /*myNum[1][2] = 7;
        System.out.println(myNum[1][2]);
        for (int i = 0; i < myNum.length; i++) {
            for (int j = 0; j < myNum[i].length; j++) {
                System.out.println(myNum[i][j]);
            }
        }*/
        for (int[] row : myNum) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
