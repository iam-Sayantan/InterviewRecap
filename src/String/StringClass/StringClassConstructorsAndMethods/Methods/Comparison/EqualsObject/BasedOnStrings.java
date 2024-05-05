package String.StringClass.StringClassConstructorsAndMethods.Methods.Comparison.EqualsObject;

public class BasedOnStrings
{
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = str1;

        System.out.println("Using ==");
        // using ==
        if (str1 == str2) {
            System.out.println("references matched between str1 : " + str1 + " & str2 : " + str2);
        } else {
            System.out.println("references did not match between str1 : " + str1 + " & str2 : " + str2);
        }

        if (str1 == str3)
        {
            System.out.println("references matched between str1 : " + str1 + " & str3 : " + str3);
        }else {
            System.out.println("references did not match between str1 : " + str1 + " & str3 : " + str3);
        }

        if (str2 == str3)
        {
            System.out.println("references matched between str2 : " + str2 + " & str3 : " + str3);
        }else {
            System.out.println("references did not match between str2 : " + str2 + " & str3 : " + str3);
        }

        System.out.println("-----------------------------");

        System.out.println("Using equals() method");
        if (str1.equals(str2)) {
            System.out.println("Content matched between str1 : " + str1 + " & str2 : " + str2);
        } else {
            System.out.println("Content did not match between str1 : " + str1 + " & str2 : " + str2);
        }

        if (str1.equals(str3))
        {
            System.out.println("Content matched between str1 : " + str1 + " & str3 : " + str3);
        }else {
            System.out.println("Content did not match between str1 : " + str1 + " & str3 : " + str3);
        }

        if (str2.equals(str3))
        {
            System.out.println("Content matched between str2 : " + str2 + " & str3 : " + str3);
        }else {
            System.out.println("Content did not match between str2 : " + str2 + " & str3 : " + str3);
        }
    }
}
