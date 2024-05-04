package String.StringClassConstructorsAndMethods.Methods.TrimmingAndStripping;

public class stripTrailing {
    public static void main(String[] args) {
    String str = "Hello, world!     ";
    String trimmedStr = str.stripTrailing();

    System.out.println("Original string: '" + str + "'");
    System.out.println(str.length());
    System.out.println("Trimmed string: '" + trimmedStr + "'");
    System.out.println(trimmedStr.length());
}
}
