package homeWork1;

public class Exe35 {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 9, d = 1;
        boolean n = (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c);
        System.out.println(n);
    }
}
