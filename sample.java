package type_conversion;

public class sample {




    void add(int a, int b) {
        System.out.println("sum of two = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("sum of three = " + (a + b + c));
    }

    void add(double x, int y) {
        System.out.println("sum of double+int = " + (x + y));
    }

    public static void main(String[] args) {
        sample s = new sample();

        s.add(5, 10);        // calls 2 int method
        s.add(5, 10, 15);    // calls 3 int method
        s.add(5.5, 10);      // calls double+int method
    }
}