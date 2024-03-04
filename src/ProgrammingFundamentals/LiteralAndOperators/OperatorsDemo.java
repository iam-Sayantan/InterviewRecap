package ProgrammingFundamentals.LiteralAndOperators;

public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = a+b; // + is arithmetic operator; a,b are operands
        int d = a%b;
        int e = a*b;
        int f = a/b;

        System.out.println("__________________");
        System.out.println("Arithmetic Operators");

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println("__________________");
        System.out.println("Unary Operators");

        int no1 = 10;
        System.out.println(no1++); // It will first display the number and then increment the number
        System.out.println(no1);

        int no2=10;
        System.out.println(++no2); // It will first increment the number and then print the number

        int no3=10;
        System.out.println(no3); // 10
        System.out.println(no3++); // 10 --> 11
        System.out.println(++no3); // 12
        System.out.println(no3); // 12

        int no4=10;
        System.out.println(no4); // 10
        System.out.println(no4--); // 10
        System.out.println(--no4); // 8
        System.out.println(no4); // 8

        System.out.println("-----");

        int no5=10;
        int aa = no5+++no5;
        int bb = no5;
        System.out.println(aa); // no5++ is treated as an entity. then first number no5 is 10 and no5++ is 11. In the end +no5 means + (11). Total = 21
        System.out.println(bb);

    }
}
