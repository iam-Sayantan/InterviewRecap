package String.StringBuilderClass;

public class StringBuilderDemo
{
    public static void main(String[] args) {
        // Create a new StringBuilder instance with initial text
        StringBuilder sb = new StringBuilder("Hello");

        // Append more text to the StringBuilder
        sb.append(" World");
        System.out.println("After append: " + sb);  // Output: Hello World

        // Insert text at a specific position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);  // Output: Hello Java World

        // Replace a part of the StringBuilder content
        sb.replace(6, 11, "Beautiful ");
        System.out.println("After replace: " + sb); // Output: Hello Beautiful World

        // Delete part of the StringBuilder content
        sb.delete(6, 16); // Delete from index 6 to 16
        System.out.println("After delete: " + sb); // Output: Hello World

        // Reverse the StringBuilder content
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH

        // Set length of the StringBuilder
        sb.setLength(5);
        System.out.println("After setting length: " + sb); // Output: dlroW

        // Clear all contents by setting length to 0
        sb.setLength(0);
        System.out.println("After clearing: '" + sb + "'"); // Output: ''
    }
}
