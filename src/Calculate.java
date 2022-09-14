import java.util.Scanner;
public class Calculate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double num1 = getNumberFromConsole();
        double num2 = getNumberFromConsole();
        char operation = symbol();
        double result = calc(num1, num2, operation);
        System.out.println("Ваш результат: " + result);
    }
    public static double getNumberFromConsole() {
        System.out.println("Введите число:");
        double number;
        if (sc.hasNextDouble()) {
            number = sc.nextDouble();
        } else {
            System.out.println("Вы не ввели число, повторите программу заного");
            sc.nextInt();
            number = getNumberFromConsole();
        }
        return number;
    }
        public static char symbol(){
            System.out.println("Введите операцию: ");
            char operation;
            if (sc.hasNext()){
                operation = sc.next().charAt(0);
            } else {
                System.out.println("Вы ввели неподдерживаему операцию");
//                sc.next();
                operation = symbol();
            }
            return operation;
        }

    public static double calc(double arg1, double arg2, char operation){
        double result;
        switch (operation) {
            case '+':
                result = arg1 + arg2;
                break;
            case '-':
                result = arg1 - arg2;
                break;
            case '*':
                result = arg1 * arg2;
                break;
            case '/':
                if (arg2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    result = arg1 / arg2;
                    break;
                }
            default:
                System.out.println("Калькулятор не поддерживает данную операцию");
                result = calc(arg1, arg2, operation);
        }
        return result;
    }
}
