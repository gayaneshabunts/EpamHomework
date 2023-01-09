import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("January-1,February-2,March-3,April-4,May-5,June-6,July-7,August-8,September-9,LOctober-10,November-11,December-12");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your month number");
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int m = s.nextInt();
        switch (m) {
            case 1,3,5,7,8,10,12:
            System.out.println("31 day");
            case 2:
                System.out.println("28 days");
            case 4,6,9,11:
                System.out.println("30 days");
        }
    }
}
