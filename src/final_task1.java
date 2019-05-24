import java.util.Scanner;

public class final_task1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String binaryNum = scan.nextLine();
        int sum = 0, a;
        char b;
        for (int i = 0; i < binaryNum.length(); i++) {
            b = binaryNum.charAt(binaryNum.length() - 1 - i);
            if(b == '1' || b == '0') {
                if (b == '1')
                    a = 1;
                else a = 0;
                sum += (a * Math.pow(2, i));
            }
            else {
                System.out.println("Неверный ввод");
                System.exit(0);
            }
        }
        System.out.println("Число в int: " + sum);

    }
}
