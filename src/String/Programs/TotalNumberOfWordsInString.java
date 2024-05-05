/*
WAP to count total number of words in String
 */
package String.Programs;

import java.util.StringTokenizer;

public class TotalNumberOfWordsInString
{
    public int totalNumberOfWordsInString(String str)
    {
        StringTokenizer st = new StringTokenizer(str);
        int length = st.countTokens();
        return length;
    }

    public static void main(String[] args)
    {
        TotalNumberOfWordsInString obj = new TotalNumberOfWordsInString();
        System.out.println(obj.totalNumberOfWordsInString("Hello My Name is Sayantan"));
    }
}
