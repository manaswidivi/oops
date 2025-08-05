package type_conversion;

public class StringBufferExample3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");  // replaces characters from index 1 to 2 (3 is exclusive)
        System.out.println(sb);    // prints HJavalo
    }
}