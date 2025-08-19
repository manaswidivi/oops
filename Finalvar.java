package type_conversion;
public class Finalvar {

    public static void main(String args[]) {
        int x = 10;
        final int y = 20;

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        x = 30;  // allowed
        //y = 40;  // ❌ not allowed, y is final

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
}
