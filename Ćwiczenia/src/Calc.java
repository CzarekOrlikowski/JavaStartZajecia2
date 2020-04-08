public class Calc {
    public static void main(String[] args) {

        double x = 12.3;
        double y = 5.5;

        double sum = x + y;
        double sub = x - y;
        double mul = x * y;
        double div = x / y;

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + sub);
        System.out.println(x + " * " + y + " = " + mul);
        System.out.println(x + " / " + y + " = " + div);
        System.out.println("Czy liczba x jest większa od 0? " + (x > 0));
        System.out.println("Czy suma jest parzysta? " + ((sum % 2) == 0));
        System.out.println("Czy x lub y jest większe od 100? " + (x > 100 || y > 100));
        System.out.println("Czy x i y jest większe od 100? " + (x > 100 && y > 100));
    }
}
