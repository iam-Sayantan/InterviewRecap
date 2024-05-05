package String.StringBufferClass;

public class StringBufferDemo
{
    public static void main(String[] args) {

        String name = "Sayantan";
        name.concat("Python");
        System.out.println(name);

        StringBuffer sb = new StringBuffer("Sayantan");
        System.out.println(sb.append("Java"));
    }
}
