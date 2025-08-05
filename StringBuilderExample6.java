package type_conversion;
public class StringBuilderExample6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());  // default capacity: 16

        sb.append("Hello");
        System.out.println(sb.capacity());  // still 16, "Hello" is only 5 chars

        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());  // now (16*2) + 2 = 34
    }
}