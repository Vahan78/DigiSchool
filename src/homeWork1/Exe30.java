package homeWork1;

public class Exe30 {
    public static void main(String[] args) {
        int a = 3, b = 9, c = 7;
        int m = 0;
        if (a < b) {
            m = b;
            b = a;
            a = m;
        }
        if (a < c) {
            m = c;
            c = a;
            a = m;
        }
        if (b < c) {
            m = c;
            c = b;
            b = m;
        }
        System.out.println(a + " " + b + " " + c);

    }
}
