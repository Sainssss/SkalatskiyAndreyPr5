import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть x: ");
        double x = scanner.nextDouble();

        double fx;
        if (x >= -1 && x < 6) {
            fx = Math.sin(x);
        } else if (x == 6) {
            fx = 3 * Math.pow(x, 2) + b * x;
        } else if (x > 6 && x < 8) {
            fx = Math.log(a * x - 3 * b);
        } else {
            System.out.println("x не належить допустимій області визначення.");
            return;
        }

        System.out.println("f(x) = " + fx);
    }
}
