public class Task1 {
    public static void main(String[] args) {
        double a = 4.4;
        double b = 0.57;
        double c = 6;
        double z = 0.054;

        double numerator = Math.cbrt(c + Math.pow(Math.abs(a - b), 2) + 3);
        double denominator = Math.pow(a, 2) + Math.pow(b, 2);
        double x = numerator / denominator;

        double y = Math.exp(Math.abs(a - b)) * (Math.pow(Math.tan(z), 2) + 1);

        System.out.println("Результат для x: " + x);
        System.out.println("Результат для y: " + y);
    }
}
