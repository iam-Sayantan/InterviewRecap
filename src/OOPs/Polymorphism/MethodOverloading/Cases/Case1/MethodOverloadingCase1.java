package OOPs.Polymorphism.MethodOverloading.Cases.Case1;

public class MethodOverloadingCase1
{
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.display(10);
        obj.display('d'); // ASCII Value of d will be printed since Widening Type casting is taking place.

        CharTest ct = new CharTest();
        ct.display((char)100);
    }
}
