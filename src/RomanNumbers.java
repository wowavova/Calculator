import java.util.Scanner;

    public class RomanNumbers {

    static Scanner scanner = new Scanner(System.in);


    public static String getString() {
        System.out.println("Введите число:");
        String num;
        if (scanner.hasNext()) {
            num = scanner.next();
        } else {
            System.out.println("Ви допустили помилку при введені числа. Попробуйте ще раз.");
            scanner.hasNext();
            num = getString();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ви допустили помилку при введені операції. Попробуйте ще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операцію не розпізнано. Введіть ще раз.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

    static int convertRomanNumeralToNumber(String symb) {
        int symbol;
        switch (symb) {

            case "I":
                return 1;

            case "II":
                return 2;

            case "III":
                return 3;

            case "IV":
                return 4;

            case "V":
                return 5;

            case "VI":
                return 6;

            case "VII":
                return 7;

            case "VIII":
                return 8;

            case "IX":
                return 9;

            case "X":
                return 10;

            default:
                System.out.println("Число недоступне. Попробуйте ще раз");
                symbol = convertRomanNumeralToNumber(getString());
        }
        return symbol;

    }

    static String convertNumberToRomanNumeral(Integer number) {

        switch (number) {
            case 1:
                return "I";

            case 2:
                return "II";

            case 3:
                return "III";

            case 4:
                return "IV";

            case 5:
                return "V";

            case 6:
                return "VI";

            case 7:
                return "VII";

            case 8:
                return "VIII";

            case 9:
                return "IX";

            case 10:
                return "X";

            default:
                return "Результат виходить за межі діапазону: I - X";

        }
    }
}



