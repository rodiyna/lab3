public class Lab3 {
    public static void main(String[] args) {


        int n = 1;
        int m = -1;
        if (n < -m) {
            System.out.print(n);
        } else {
            System.out.print(m);
        }

        int n2 = 1;
        int m2 = -1;
        if (-n2 >= m2) {
            System.out.print(n2);
        } else {
            System.out.print(m2);
        }

        double x = 0;
        double y = 1;
        if (Math.abs(x - y) < 1) {
            System.out.print(x);
        } else {
            System.out.print(y);
        }

       double x2 = Math.sqrt(2);
        double y2= 2;
        if (x2 * x2== y2) {
            System.out.print(x2);
        } else {
            System.out.print(y2);
        }
    }
}
