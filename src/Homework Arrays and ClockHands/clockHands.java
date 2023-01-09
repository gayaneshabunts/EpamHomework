import java.util.Scanner;

public class clockHands {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        if (c > 12) {
            System.out.println("no");
        }else if (c<0){
            System.out.println("no");
        }
        else if(c == 0){
            System.out.println("00");
        }
        else System.out.println(c * 5);
    }
}


