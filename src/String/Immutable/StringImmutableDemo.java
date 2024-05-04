package String.Immutable;

public class StringImmutableDemo
{
    public static void main(String[] args)
    {
        String name = "Sayantan";

//        name=name.concat("java");

        name.concat(" java");

        System.out.println("Name :: "+name);
    }
}

/*
Line 1: String name = "Sayantan";
A string object is created with the value "Sayantan" and name refers to this object.

Line 2: name = name.concat("java");
The concat() method is called on the string referenced by name, which is "Sayantan".
The method creates a new string "Sayantanjava" because strings are immutable in Java; thus, any modification results in a new string object.
The variable name is then updated to refer to this new string object "Sayantanjava".

Line 3: name.concat(" java");
This line also calls the concat() method on the string currently referenced by name, which is now "Sayantanjava".
It attempts to concatenate " java" to "Sayantanjava", resulting in the creation of a new string "Sayantanjava java".
However, because the result is not assigned back to any string variable, this newly created string is not stored or referenced.
It becomes a candidate for garbage collection since no reference points to it.

Line 4: System.out.println("Name :: "+name);
This line prints the current value of name, which is "Sayantanjava". The concatenation in the previous line did not alter name because it was not reassigned to the result of the concat() method.
 */