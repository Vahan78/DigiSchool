package homeWork1;

public class Exe31 {
    public static void main(String[] args) {
        int a = 5, b = 4, c = 9, d = 3;
        int max;
        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= a && b >= c && b >= d) {
            max = b;
        } else if (c >= a && c >= b && c >= d) {
            max = c;
        } else {
            max = d;
        } ;


        System.out.println(" the maximum number of all is " + max);

    }
}
