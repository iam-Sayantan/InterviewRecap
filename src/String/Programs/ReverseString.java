/*
WAP to reverse a String
 */

package String.Programs;

public class ReverseString
{
    /*
    USING STRINGBUFFER INTERNAL METHODS
     */

    /*
        public String reverseString(String str)
        {
            StringBuffer sb = new StringBuffer(str);
            return sb.reverse().toString();
        }

        public static void main(String[] args)
        {
            ReverseString rs = new ReverseString();
            System.out.println(rs.reverseString("Hello"));
        }
     */


    public String reverseString(String str)
    {
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--)
        {
            reversed = reversed+(str.charAt(i));
        }
        return reversed;
    }

    public static void main(String[] args)
    {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("pneumonoultramicroscopicsilicovolcanoconiosis"));
    }
}

