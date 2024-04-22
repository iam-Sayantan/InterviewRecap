package OOPs.NestedClass.Types.MemberInnerClass.AccessingPrivateMembersofOuterClass;

public class MemberInnerClassDemo
{
    public static void main(String[] args)
    {
        Outer ob1 = new Outer();
        Outer.Inner ob2 = ob1.new Inner();
        ob2.show2();
    }
}
