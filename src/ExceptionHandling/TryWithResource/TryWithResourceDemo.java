package ExceptionHandling.TryWithResource;

// Importing the FileInputStream class for reading byte streams from files.
import java.io.FileInputStream;

public class TryWithResourceDemo {
    public static void main(String[] args) {
        // The try-with-resources block ensures that each resource is closed at the end of the statement.
        // It's a try statement that declares one or more resources. A resource is an object that must be closed after finishing its work.
        try (FileInputStream fis = new FileInputStream("")) {
            // Attempt to read the first byte of data from the stream.
            // This operation can throw an IOException if an I/O error occurs.
            fis.read();
        } catch (Exception e) {
            // Catch any Exception that might be thrown during the file reading process.
            // This includes FileNotFoundException, IOException, etc.
            // Here, we simply print out the exception to the console.
            System.out.println(e);
        }
        // After the try block, the FileInputStream 'fis' will automatically be closed,
        // which is the advantage of using try-with-resources. This reduces the risk of resource leaks.
    }
}
