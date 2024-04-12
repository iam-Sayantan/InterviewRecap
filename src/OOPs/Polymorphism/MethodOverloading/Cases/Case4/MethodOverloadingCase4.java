package OOPs.Polymorphism.MethodOverloading.Cases.Case4;

public class MethodOverloadingCase4
{
    public static void main(String [] args)
    {
        System.out.println("1");

        MethodOverloadingCase4 obj = new MethodOverloadingCase4();
        int arr[]={10,20};
        obj.main(arr);
        obj.main("Hello");
    }
    public static void main(int [] args)
    {
        System.out.println("2 with int");
    }
    public static void main(String args)
    {
        System.out.println("2 with String");
    }
}

