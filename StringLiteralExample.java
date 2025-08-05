package type_conversion;

public class StringLiteralExample {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "Welcome";  // No new object is created

        // Comparing references
        System.out.println(s1 == s2);       // true → same reference
        System.out.println(s1.equals(s2));  // true → same content
    }
}