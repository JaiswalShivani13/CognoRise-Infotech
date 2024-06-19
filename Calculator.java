import java.util.*;
public class Calculator {
    public static void main(String []args) {
        try {
            int ans;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your first number:");
            int number1 = sc.nextInt();
            System.out.println("Enter your second number:");
            int number2 = sc.nextInt();
            System.out.println("Enter the operator(+,-,*,/)");
            int op = sc.next().charAt(0);
            switch (op) {
                case '+':
                    ans = number1 + number2;
                    break;
                case '-':
                    ans = number1 - number2;
                    break;
                case '*':
                    ans = number1 * number2;
                    break;
                case '/':
                    ans = number1 / number2;
                    break;
                default:
                    System.out.println("Error");
                    return;
            }
            System.out.println("Answer is :" + ans);
        }
            catch(Exception e){
                System.out.println("You can't divide by zero");


        }
    }
}
