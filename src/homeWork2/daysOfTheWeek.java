package homeWork2;

public class daysOfTheWeek {
    public static void main(String[] args) {
        int day = 12;
        switch (day) {
            case 1:
            case 3:
            case 5:
                System.out.println("school day");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("home day");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This is the wrong number");
        }

    }
}
