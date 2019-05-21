import java.util.Scanner;

public class final_task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текущий курс: ");
        double course = scan.nextDouble();
        System.out.println("Введите количество рублей: ");
        int rub = scan.nextInt();
        double usd = (double)(course*rub);
        System.out.println("Значение в долларах: ");
        System.out.printf("%.2f", usd);
    }

}
