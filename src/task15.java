import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = scan.nextInt();
        int mass[] = new int[size];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < size; i++) {
            mass[i] = scan.nextInt();
        }
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < size; i++)
            System.out.print(mass[i] + " ");
    }
}
