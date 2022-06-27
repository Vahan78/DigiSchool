package homeWork1;

public class Exe25 {
    public static void main(String[] args) {
        int a = 12, b = 12, c = 25;
        int count = 2;
        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("y=2");
        } else {
            System.out.println("y=1");
        }

    }
}