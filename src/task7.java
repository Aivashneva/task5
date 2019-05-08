import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число T: ");
        int t = scan.nextInt();
        switch (t) {
            case 5:
            case 7:
            case 10:
                System.out.println("Данное значение имеется в константах");
                break;
             default:
                 System.out.println("Такой константы нет!");
        }
    }
}
        /* второй вариант
        int x = 5;
        int y = 7;
        int z = 10;
        if (t == x)
            System.out.println("Данное значение имеется в константах");
        else if (t == y)
            System.out.println("Данное значение имеется в константах");
        else if (t == z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");*/
