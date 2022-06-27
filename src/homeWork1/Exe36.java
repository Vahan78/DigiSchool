package homeWork1;

public class Exe36 {
    public static void main(String[] args) {
        int a = 3, b = 8, c = 4, d = 6;
        int count = 0;
        if (a % 2 == 1) {
            count++;
        }
        if (b % 2 == 1) {
            count++;
        }
        if (c % 2 == 1) {
            count++;
        }
        if (d % 2 == 1) {
            count++;
        }
        if (count > 1) {

            System.out.println("1");

        } else {
            System.out.println("2");
        }
    }
}