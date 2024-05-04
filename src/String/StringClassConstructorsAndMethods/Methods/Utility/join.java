package String.StringClassConstructorsAndMethods.Methods.Utility;

public class join {
    public static void main(String[] args) {
        // Define the words as separate strings
        String[] words = {"Hello", "world", "from", "Java"};

        // Join the words using a space as the delimiter
        String sentence = String.join(" ", words);

        System.out.println(sentence);
    }
}

