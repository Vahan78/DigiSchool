package homeWork1;

public class Exe32 {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 9, d = 3;
        int min;
        if (a <= b && a <= c && a <= d) {
            min = a;
        } else if (b <= a && b <= c && b <= d) {
            min = b;
        } else if (c <= a && c <= b && c <= d) {
            min = c;
        } else {
            min = d;
        } ;


        System.out.println("the minimal number of all is " + min);
    }
}
