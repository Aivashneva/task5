import java.io.*;

public class task18 {
    public static void main(String[] args) {
        String s;
        int lineNumber = 0;
        //количество строк
        try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("src\\task18.txt"))) {
            while (lineNumberReader.readLine() != null) {
                lineNumber++;
            }
            //System.out.println("Количество строк " + lineNumber + "\n");
        } catch (IOException exc) {
            System.out.println("Ошибка" + exc);
        }
        // вывод из файла
        if (lineNumber != 0) {
            try (BufferedReader br = new BufferedReader(new FileReader("src\\task18.txt"))) {
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException exc) {
                System.out.println("Ошибка" + exc);
            }
            // перезапись
            try (FileWriter fw = new FileWriter("src\\task18.txt")) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\n Введите новые данные: ");
                do {
                    s = br.readLine();
                    s = s + "\r\n";
                    fw.write(s);
                    lineNumber--;
                } while (lineNumber != 0);
            } catch (IOException exc) {
                System.out.println("Ошибка" + exc);
            }
        } else
            System.out.println("Файл пустой!");
    }
}
