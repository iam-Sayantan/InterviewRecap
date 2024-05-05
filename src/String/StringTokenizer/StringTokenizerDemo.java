package String.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo
{
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("This is my first demo");
        System.out.println(st1.countTokens());

        while (st1.hasMoreTokens())
        {
            System.out.println("Token : "+st1.nextToken());
        }
    }
}
