package String.StringClassConstructorsAndMethods.Methods.StringModification;

public class Split {
    public static void main(String[] args) {
        String str = "Sayantan Sengupta will earn a top job offer";
        // Split the string at each space to separate words
        String[] words = str.split("\\s+");

        // Print each word in a new line to clearly show the output
        for (String word : words) {
            System.out.println(word);
        }
    }
}
