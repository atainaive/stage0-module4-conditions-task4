package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first);
        } else if (second > first && second > third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }

        int result = 0;
        result = (first > second && first > third) ? first : 0;
        result = (result == 0 && second > first && second > third) ? second : third;
        System.out.println(result);
    }
}
