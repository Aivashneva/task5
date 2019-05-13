import java.util.Scanner;
import java.lang.String;

public class task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String MyString = scan.nextLine();
        String ResultString = MyString.replaceAll(" ","");
        System.out.print("Строка без пробелов: \n" + ResultString);
    }

}
