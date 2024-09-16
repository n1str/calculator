import java.util.Scanner;

class Calculator {
    private double num1;

    private Scanner sc;

    public Calculator(Scanner sc) {
        this.sc = sc;
    }

    public Calculator() {
        this.num1 = 0;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void run() {

        while (true) {
            if (num1 == 0) {
                System.out.println("_____________________________________");
                System.out.println("Введите число: ");
                System.out.println("_____________________________________");
                setNum1(sc.nextDouble());
            }

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
                setNum1(0);
            } else if (znak == '+' || znak == '-' || znak == '*' || znak == '/') {
                System.out.println("_____________________________________");
                System.out.println("Введите число: ");
                System.out.println("_____________________________________");
                double num2 = sc.nextDouble();

                calculate(znak, num2);
                printResult();
            } else {
                System.out.println("_____________________________________");
                System.out.println("Такого знака не существует");
                System.out.println("_____________________________________");
            }
        }
    }

    public void calculate(char znak, double num2) {
        switch (znak) {
            case '+':
                num1 += num2;
                break;
            case '-':
                num1 -= num2;
                break;
            case '*':
                num1 *= num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("_____________________________________");
                    System.out.println("На 0 делить нельзя");
                    System.out.println("_____________________________________");
                } else {
                    num1 /= num2;
                }
                break;
        }
    }

    public void printResult() {
        System.out.println("_____________________________________");
        if (num1 % 1 == 0) {
            System.out.println("Ответ: " + (int) num1);
        } else {
            System.out.println("Ответ: " + String.format("%.7f", num1));
        }
    }
}
