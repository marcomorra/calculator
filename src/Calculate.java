public class Operation {
    public static void main(String[] args) {

        System.out.println(dev(10, 2));
    }

    public static double sum(double arg1, double arg2) {
        double sum = arg1 + arg2;
        return sum;
    }

    public static double sub(double arg1, double arg2) {
        double sub = arg1 - arg2;
        return sub;
    }

    public static double mult(double arg1, double arg2) {
        double mult = arg1 * arg2;
        return mult;
    }

    public static double dev(double arg1, double arg2) {
        double dev = arg1 / arg2;
        return dev;
    }
}