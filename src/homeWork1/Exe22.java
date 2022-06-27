package homeWork1;

public class Exe22 {
    public static void main(String[] args) {
        int a = 5, b = 1, c = 9;
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else min = c;

        System.out.println("Minimal number is " + min);
    }
}
