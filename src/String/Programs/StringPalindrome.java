/*
WAP to check String Palindrome
 */
package String.Programs;

public class StringPalindrome
{
    /*
    USING STRINGBUFFER


    public String stringPalindrome(String str)
    {
        String original = str;
        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString();
        if(original.equals(reversed))
        {
            return str+" is Palindrome";
        }
        else
        {
            return str+" is not Palindrome";
        }
    }

    public static void main(String[] args)
    {
        StringPalindrome sp = new StringPalindrome();
        System.out.println(sp.stringPalindrome("bob"));
    }

     */

    public String stringPalindrome(String str)
    {
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--)
        {
            reversed = reversed+(str.charAt(i));
        }
        if(reversed.equals(str))
        {
            return str+" is Palindrome";
        }
        else
        {
            return str+" is not palindrome";
        }
    }


    public static void main(String[] args)
    {
        StringPalindrome sp = new StringPalindrome();
        System.out.println(sp.stringPalindrome("Hello"));
        System.out.println(sp.stringPalindrome("racecar"));
        System.out.println(sp.stringPalindrome("level"));
    }

}
