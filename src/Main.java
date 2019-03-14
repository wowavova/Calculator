import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        ArabicNumbers calarab = new ArabicNumbers();
        RomanNumbers calrom = new RomanNumbers();

        System.out.println("Введіть число в діапазоні: 0 - 10 або I - X");

        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            int num2 = calarab.getInt();
            char operation = calarab.getOperation();
            int result = calarab.calc(num1, num2, operation);
            System.out.println("Результат операції: " + result);
        }
        else {
            String symb1 = scanner.nextLine();
            int num1 = calrom.convertRomanNumeralToNumber(symb1);
            String symb2 = calrom.getString();
            int num2 = calrom.convertRomanNumeralToNumber(symb2);
            char operation = calrom.getOperation();
            int result = calrom.calc(num1, num2, operation);
            String resultRom = calrom.convertNumberToRomanNumeral(result);
            System.out.println("Результат операцї: " + resultRom);
        }

    }
}
