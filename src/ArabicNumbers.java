import java.util.Scanner;

/**
 * Created by wowa on 13.03.2019.
 */
public class ArabicNumbers {

        static Scanner scanner = new Scanner(System.in);

        public static int getInt(){
            System.out.println("Введіть число:");
            int num;
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
            } else {
                System.out.println("Ви допустили помилку при введені числа. Попробуйте ще раз.");
                scanner.next();//рекурсия
                num = getInt();
            }
            return num;
        }

        public static char getOperation(){
            System.out.println("Введіть операцію:");
            char operation;
            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Ви допустили помилку при введені операції. Попробуйте ще раз.");
                scanner.next();//рекурсия
                operation = getOperation();
            }
            return operation;
        }

        public static int calc(int num1, int num2, char operation){
            int result;
            switch (operation){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                default:
                    System.out.println("Операцію не розпізнано. Введіть ще раз.");
                    result = calc(num1, num2, getOperation());
            }
            return result;
        }
    }

