package String.StringClass.StringClassConstructorsAndMethods.Methods.TrimmingAndStripping;

public class Strip {
    public static void main(String[] args) {
        String str = "   Hello, world!   ";
        String trimmedStr = str.strip();

        System.out.println("Original string: '" + str + "'");
        System.out.println(str.length());
        System.out.println("Trimmed string: '" + trimmedStr + "'");
        System.out.println(trimmedStr.length());
    }
}

