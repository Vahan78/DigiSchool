package homeWork1;

public class Exe21 {
    public static void main(String[] args) {
        int a = 5, b = 1, c = 9;
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else max = c;

        System.out.println("Maximum number is " + max);
    }
}
