package OOPs.thisKeyword.Examples.Example2;

public class Student
{
    int rollNo;
    String name;

    Student(int rollNo, String name)
    {
        this.rollNo=rollNo;
        this.name=name;

        /*
        [parameters (formal arguments) and
        instance variables are same.
        So, we are using this keyword
        to distinguish local variable and instance variable.]

         */

//        rollNo=rollNo;
//        name=name;
    }

    void show()
    {
        System.out.println("Student Roll No :: "+rollNo);
        System.out.println("Student Name :: "+name);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student(12,"Tom");
        s1.show();
    }
}
