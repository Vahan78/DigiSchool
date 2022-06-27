package homeWork2;

public class Homework2Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] % 10 == 0) {
                System.out.println();
            }

        }
    }
}
