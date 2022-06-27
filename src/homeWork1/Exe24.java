package homeWork1;

public class Exe24 {
    public static void main(String[] args) {
        int a = 2, b = 2, c = 3;
        boolean n = ((a == 2 && b == 2 && c != 2) || (a == 2 && c == 2 && b != 2) || (b == 2 && c == 2 && a != 2));

        System.out.println(n);
    }
}

