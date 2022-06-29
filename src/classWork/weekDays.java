package classWork;

public class weekDays {
    public static void main(String[] args) {
        int day = 700;
        if (day > 7) {
            day = day % 7;
        }
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
            case 0:
                System.out.println("Sunday");

        }
    }
}
