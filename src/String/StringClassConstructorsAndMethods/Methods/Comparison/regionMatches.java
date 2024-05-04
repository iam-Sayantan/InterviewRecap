package String.StringClassConstructorsAndMethods.Methods.Comparison;

 /*
        This method is quite useful when you need to perform substring comparisons within larger strings,
        especially when checking for the presence of a segment without considering the exact position
        or when matching patterns where case might vary.

        Case-sensitive version:
        boolean regionMatches(int toffset, String other, int ooffset, int len)

        toffset: the starting index of the substring in the current string.
        other: the other string to compare with.
        ooffset: the starting index of the substring in the other string.
        len: the number of characters to compare.

        Case-insensitive version:
        boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)

        ignoreCase: if true, the comparison is case insensitive.
        toffset: the starting index of the substring in this string.
        other: the other string to compare with.
        ooffset: the starting index of the substring in the other string.
        len: the number of characters to compare.
         */

public class regionMatches {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "world";

        // Case-sensitive comparison: Checks if "World" in str1 matches "world" in str2
        boolean result1 = str1.regionMatches(6, str2, 0, 5);
        System.out.println("Case-sensitive match: " + result1); // Expected: false

        // Case-insensitive comparison: Checks if "World" in str1 matches "world" in str2
        boolean result2 = str1.regionMatches(true, 6, str2, 0, 5);
        System.out.println("Case-insensitive match: " + result2); // Expected: true


    }
}

