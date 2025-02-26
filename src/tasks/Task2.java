package tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вводим строки "a" и "b" которые будем сравнивать

        System.out.println("Введите перву строку (а): ");
        String a = scanner.nextLine();

        System.out.println("Введите вторую строку (b): ");
        String b = scanner.nextLine();

        // Сравнение строк

        if(a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }

        scanner.close();
    }
}
