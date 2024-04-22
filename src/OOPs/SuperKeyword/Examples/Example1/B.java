package OOPs.SuperKeyword.Examples.Example1;

public class B extends A
{
    int no = 20;
    void show(int no)
    {
        System.out.println(no);
        System.out.println(this.no);
        System.out.println(super.no);
    }

    void display()
    {
        int total = super.no+this.no;
        System.out.println("Total "+total);
    }
}
