package OOPs.NestedClass.Types.MemberInnerClass.AccessingPrivateMembersofOuterClass;

public class Outer
{
    private int a = 10;
    class Inner
    {
        void show2()
        {
            System.out.println(a);
        }
    }
}
