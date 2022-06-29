package classWork;

public class lesson4 {
    public static void main(String[] args) {
        int[] array = {10, 7, 7, 15, 2, 15, 10};
        int max = array[0];
        int min = array[0];
        int indexMin = 0;
        int indexMax = 0;
        int countZero = 0;
        int y = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] <= min) {
                min = array[i];
                indexMin = i;

            }
            if (array[i] == 0) {
                countZero++;
            }
            y = y ^ array[i];


        }
        System.out.println("Maximum number is " + max + " it index is " + indexMax);
        System.out.println("Minimum number is " + min + " it index is " + indexMin);
        System.out.println("Count of zerro in arrray is " + countZero);
        System.out.println(y);
    }
}
