package homeWork1;

public class Exe39 {
    public static void main(String[] args) {
        int a = 7, b = 16, c = 9, d = 1;
        int min;
        if (a > b) {
            min = b;
            b = a;
            a = min;
        }
        if (a > c) {
            min = c;
            c = a;
            a = min;
        }
        if (a > d) {
            min = d;
            d = a;
            a = min;
        }
        if (b > c) {
            min = c;
            c = b;
            b = min;
        }
        if (b > d) {
            min = d;
            d = b;
            b = min;
        }
        if (c > d) {
            min = d;
            d = c;
            c = min;
        }

        System.out.println(a + " " + b + " " + c + " " + d);

    }
}


