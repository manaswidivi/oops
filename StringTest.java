package type_conversion;


public class StringTest {
    public static void main(String[] args) {
        String s1 = "Nirmala";
        String s2 = "Nirmala";

        // This is true because both refer to the same object in the String pool
        System.out.println(s1 == s2); // true

        // s1 now points to a new string "NirmalaJyothi"
        s1 = s1 + "Jyothi";

        // s1 is now a new object, s2 is still "Nirmala"
        System.out.println(s1 == s2); // false

        String s3 = "NirmalaJyothi";

        // Even though content is same, s1 is created at runtime, s3 is a literal
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true (compares actual content)
    }
}