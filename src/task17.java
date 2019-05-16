import java.io.*;

public class task17 {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Запись ведётся в файл до тех пор, пока не будет введена команда stop");
        try (FileWriter fw = new FileWriter("task17.txt"))
        {
            do {
                System.out.println(": ");
                s = br.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "\r\n";
                fw.write(s);
            } while (s.compareTo("stop") != 0);
        }
        catch (IOException exc) {
            System.out.println("Ошибка" + exc);
        }
    }

}