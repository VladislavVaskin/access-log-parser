import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Случайное число от 0 до 1: " + Math.random());
        System.out.println("Введите текст и нажмите <Enter>:");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длинна текста: " + text.length());*/
        int counter = 1;
        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExist || isDirectory) {
                System.out.println("Указан неверный путь к файлу. Введите еще раз");
                counter++;
                continue;
            }
            if (fileExist && !isDirectory) {
                System.out.println("Путь указан верно. Это файл №:" + counter);
                break;
            }
        }
    }
}