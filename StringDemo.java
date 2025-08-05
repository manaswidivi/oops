package type_conversion;

public class StringDemo {
    public static void main(String[] args) {
        String str = "This is some sample String with some words " +
                     "that have been repeated some times";

        System.out.println("Total no. of characters : " + str.length());
        System.out.println("To Upper Case : " + str.toUpperCase());
        System.out.println("To Lower Case : " + str.toLowerCase());
        System.out.println("Original String : " + str);
        System.out.println("Substring from index 8 : " + str.substring(8));
        System.out.println("Substring from index 8 to 19 : " + str.substring(8, 19));
        System.out.println("First index of 'some' : " + str.indexOf("some"));

        // Extra space padding
        String s = "\t" + str + "\t";  // Using tab for clear visible whitespace
        System.out.println("String with tabs: " + s);
        System.out.println("After trim: [" + s.trim() + "]");

        // Replace 's' with $$##
        System.out.println("Replace 's' with '$$##': " + str.replace("s", "$$##"));

        // Reverse another string
        String sh = "parth is a good boy";
        System.out.println("Original: " + sh + " -> Reversed: " + new StringBuffer(sh).reverse());
    }
}