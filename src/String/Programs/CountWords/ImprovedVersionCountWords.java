package String.Programs.CountWords;

public class ImprovedVersionCountWords {
    public int totalNumberOfWordsInString(String str) {
        int count = 0;
        boolean insideWord = false;  // Start with false to correctly handle the beginning of the string

        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                insideWord = false;  // We are outside a word when we hit whitespace
            } else if (!insideWord) {  // Only increment count when transitioning from whitespace to a word
                insideWord = true;  // Now we are inside a word
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ImprovedVersionCountWords obj = new ImprovedVersionCountWords();
        System.out.println(obj.totalNumberOfWordsInString("Hello My Name is Sayantan"));  // Output should be 5
    }
}
