import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = scan.nextInt();
        int mass[] = new int[size];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < size; i++) {
            mass[i] = scan.nextInt();
        }
        System.out.println("Итоговый массив: ");
        for (int i = 0; i < size; i++) {
            System.out.println(mass[i] * 2);
        }
    }
}
