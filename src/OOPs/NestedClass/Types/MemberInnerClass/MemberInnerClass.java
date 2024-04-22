package OOPs.NestedClass.Types.MemberInnerClass;

public class MemberInnerClass
{
    public static void main(String[] args)
    {
        Outer ob1 = new Outer();
        ob1.show1();

        Outer.Inner ob2 = ob1.new Inner();
        ob2.show2();
    }
}
