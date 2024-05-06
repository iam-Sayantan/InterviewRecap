/*
WAP to count total number of words in String
 */
package String.Programs.CountWords;

public class TotalNumberOfWordsInString
{
    public int totalNumberOfWordsInString(String str)
    {
        /*

            StringTokenizer st = new StringTokenizer(str);
            int length = st.countTokens();
            return length;

         */

        int count = 0;
        boolean insideWord = true;

        for(int i=0;i<str.length();i++)
        {
            System.out.println("When i is "+i+" then "+str.charAt(i));
            if(str.charAt(i)==' ')
            {
                insideWord=true;
            }
            else if(insideWord==true)
            {
                insideWord=false;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        TotalNumberOfWordsInString obj = new TotalNumberOfWordsInString();
        System.out.println(obj.totalNumberOfWordsInString("Hello My Name is Sayantan"));
    }
}
