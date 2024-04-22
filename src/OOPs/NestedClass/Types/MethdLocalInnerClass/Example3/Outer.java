package OOPs.NestedClass.Types.MethdLocalInnerClass.Example3;

public class Outer
{
    void show()
    {
        class Inner // We cannot provide any public/private access modifier here.
        {
            private int a = 10; // We can provide any access modifier here.
            void show()
            {
                System.out.println(a);
            }
        }
        Inner innerOb = new Inner();
        innerOb.show();
    }
}
