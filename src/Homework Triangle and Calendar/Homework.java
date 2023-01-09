import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {



    Scanner s = new Scanner(System.in);
        System.out.println("Enter Triangle parameters");
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
if(a<(b+c)&&b<(a+c)&&c<(a+b)){
        System.out.println("It is a Tiangle");
    } else System.out.println("It is not a Triangle");


}
}