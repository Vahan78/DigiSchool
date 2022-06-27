package homeWork1;

public class Exe40 {
    public static void main(String[] args) {
        int a = 7, b = 16, c = 9, d = 1;
        int max;
        if (a < b) {
            max = b;
            b = a;
            a = max;
        }
        if (a < c) {
            max = c;
            c = a;
            a = max;
        }
        if (a < d) {
            max = d;
            d = a;
            a = max;
        }
        if (b < c) {
            max = c;
            c = b;
            b = max;
        }
        if (b < d) {
            max = d;
            d = b;
            b = max;
        }
        if (c < d) {
            max = d;
            d = c;
            c = max;
        }

        System.out.println(a + " " + b + " " + c + " " + d);

    }
}

