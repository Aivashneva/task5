import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = scan.nextInt();
        System.out.println("Введите число y: ");
        int y = scan.nextInt();
        System.out.println("Введите число z: ");
        int z = scan.nextInt();

        double average = (x+y+z)/3;
        if ((average/2) > 3)
            System.out.println("Программа выполнена корректно");

    }
}
