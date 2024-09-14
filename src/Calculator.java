class Calculator {
    private double num1;

    public Calculator() {
        this.num1 = 0;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
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