public class LogicalOperation {
    public static void main(String[] args) {
        double x = 20;
        double y = 15;
        double z = 10;

        boolean condition1 = (x > y || y > z);
        boolean condition2 = (x > y && y > z);
        boolean condition3 = (x + z >= y);
        boolean condition4 = (y - z <= x);
        boolean condition5 = (x * y != z);
        boolean condition6 = (x * y > x /z);

        System.out.println(condition1);
        System.out.println(condition2);
        System.out.println(condition3);
        System.out.println(condition4);
        System.out.println(condition5);
        System.out.println(condition6);

        System.out.println("x > y || y > z - " + (x > y || y > z));
        System.out.println("x > y && y > z - " + (x > y && y > z));
        System.out.println("x + z >= y - " + (x + z >= y));
        System.out.println("y - z <= x - " + (y - z <= x));
        System.out.println("x * y != z - " + (x * y != z));
        System.out.println("x * y > x /z - " + (x * y > x /z));
    }
}
