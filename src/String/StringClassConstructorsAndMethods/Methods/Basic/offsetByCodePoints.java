package String.StringClassConstructorsAndMethods.Methods.Basic;

public class offsetByCodePoints
{
    public int offsetByCodePoints(String str)
    {
        return str.offsetByCodePoints(1,3);
    }

    public static void main(String[] args) {
        offsetByCodePoints obj = new offsetByCodePoints();
        System.out.println(obj.offsetByCodePoints("Sâyântân"));
    }
}
