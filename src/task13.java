import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String MyString1 = scan.nextLine();
        System.out.println("Введите вторую строку: ");
        String MyString2 = scan.nextLine();
        int len1 = MyString1.length();
        int len2 = MyString2.length();
        if (len1 > len2)
            System.out.println("Строка с наибольшей длинной: \n" + MyString1);
        else if (len1 == len2)
            System.out.println("Введены строки одинаковой длины");
        else
            System.out.println("Строка с наибольшей длинной: \n" + MyString2);
    }
}
