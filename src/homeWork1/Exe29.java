package homeWork1;

public class Exe29 {
    public static void main(String[] args) {
        int a = 6, b = 8, c = 5;
        int m;
        if (a > b) {
            m = b;
            b = a;
            a = m;
        }
        if (a > c) {
            m = c;
            c = a;
            a = m;
        }
        if (b > c) {
            m = c;
            c = b;
            b = m;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
