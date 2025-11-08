import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе целое число:");
        int number2 = new Scanner(System.in).nextInt();
        int firstResult = number1 + number2;
        int secondResult = number1 - number2;
        int thirdResult = number1 * number2;
        double fourthResult = (double) number1 / number2;
        System.out.println("Сумма:" + firstResult);
        System.out.println("Разность:" + secondResult);
        System.out.println("Произведение:" + thirdResult);
        System.out.println("Частное:" + fourthResult);
    }
}