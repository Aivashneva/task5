import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        String s = scan.nextLine();
        System.out.println(s);
        int x = Integer.parseInt(s);
        System.out.println(x);
        double y = (double)x;
        System.out.println(y);
    }
}