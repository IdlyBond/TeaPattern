import java.util.Scanner;

public class Printer {

    public static int getIndex(int from, int to){
        Scanner scr = new Scanner(System.in);
        while (true) {
            if (scr.hasNextInt()) {
                int index = scr.nextInt();
                if (index >= from && index <= to) return index;
            }
            System.out.println("Попробуйте еще раз");
            scr.next();
        }
    }
}
