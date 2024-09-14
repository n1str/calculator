import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("_____________________________________");
            System.out.println("Введите число: ");
            System.out.println("_____________________________________");
            calculator.setNum1(sc.nextDouble());

            while (true) {
                System.out.println("_____________________________________");
                System.out.println("|s - Сброс калькулятора             |");
                System.out.println("|q - Завершение работы калькулятора |");
                System.out.println("|Введите действие: | + | - | / | * ||");
                System.out.println("|___________________________________|");

                char znak = sc.next().charAt(0);

                if (znak == 'q') {
                    System.out.println("_____________________________________");
                    System.out.println("Выход из программы...");
                    System.out.println("_____________________________________");
                    System.exit(0);
                } else if (znak == 's') {
                    System.out.println("_____________________________________");
                    System.out.println("Сброс");
                    break;
                } else if (znak == '+' || znak == '-' || znak == '*' || znak == '/') {
                    System.out.println("_____________________________________");
                    System.out.println("Введите число: ");
                    System.out.println("_____________________________________");
                    double num2 = sc.nextDouble();

                    calculator.calculate(znak, num2);
                    calculator.printResult();
                } else {
                    System.out.println("_____________________________________");
                    System.out.println("Такого знака не существует");
                    System.out.println("_____________________________________");
                }
            }
        }
    }
}
