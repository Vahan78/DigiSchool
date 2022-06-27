package classWork;

public class Lesson3 {
    public static void main(String[] args) {
        int number = 49587;
        int reversNumber = 0;
        while (number != 0) {                                               // for(i=0; number=0; i++){
            reversNumber = (reversNumber * 10) + (number % 10);             // reversNumber = reversNumber*10 + number*10;
            number = number / 10;                                           // number number /10;

        }
        System.out.println(reversNumber);

    }
}
