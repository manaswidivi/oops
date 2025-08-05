package type_conversion;

public class StringBuilderExample7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity()); // default 16

        sb.append("Hello");
        System.out.println(sb.capacity()); // still 16

        sb.append("Java is my favourite language");
        System.out.println(sb.capacity()); // (16*2) + 2 = 34

        sb.ensureCapacity(10); // no change, since 10 < 34
        System.out.println(sb.capacity()); // still 34

        sb.ensureCapacity(50); // capacity = (34*2) + 2 = 70
        System.out.println(sb.capacity()); // now 70
    }
}