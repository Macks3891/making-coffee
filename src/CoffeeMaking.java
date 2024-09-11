import java.util.Scanner;

public class CoffeeMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Начинаем процесс заваривания кофе.");

        System.out.println("Нагреваем воду.");

        System.out.println("Засыпаем кофе в кофеварку.");

        System.out.println("Завариваем кофе в кофеварке.");
        System.out.println("Ожидаем, пока кофе полностью перельется в ковшик.");

        System.out.println("Переливаем кофе в чашку.");

        System.out.print("Хотите добавить сахар? (да/нет): ");
        String addSugar = scanner.nextLine();
        if (addSugar.equalsIgnoreCase("да")) {
            System.out.print("Сколько ложек сахара добавить? ");
            int sugarAmount = scanner.nextInt();
            System.out.println("Добавляем " + sugarAmount + " ложек сахара...");
        } else {
            System.out.println("Сахар не добавляем.");
        }
        System.out.print("Хотите добавить молоко? (да/нет): ");
        String addMilk = scanner.nextLine();
        if (addMilk.equalsIgnoreCase("да")) {
            System.out.print("Сколько миллилитров молока добавить? ");
            int milkAmount = scanner.nextInt();
            System.out.println("Добавляем " + milkAmount + " мл молока...");
        } else {
            System.out.println("Молоко не добавляем.");
        }

        System.out.println("Наслаждаемся свежезаваренным кофе!");

        scanner.close();
    }
}