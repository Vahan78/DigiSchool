package homeWork2;

public class Homework2Task3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i - (19 - i);
        }
        for (int i = 0; i < 20; i++) {


            System.out.print(array[i] + "  ");

        }
    }
}
