import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int size1 = scan.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int size2 = scan.nextInt();
        int mass[][] = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("Введите элемент mass[" + i + "][" + j + "]:");
                mass[i][j] = scan.nextInt();
            }
        }
        System.out.println("Итоговый массив: ");
            for (int j = 0; j < size2; j++) {
                System.out.println(mass[0][j] * 3);
            }
        }
    }

