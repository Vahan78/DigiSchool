package homeWork2;

public class Homework3Task5 {
    public static void main(String[] args) {
        double[] array = {22, 24.13, 26, 467.23, 467.22, 25.22, 468};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 24.12 && array[i] < 467.23)
                System.out.print(array[i] + "  ");

        }
    }
}
