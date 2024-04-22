package OOPs.StaticKeyword.Examples.ExampleVairables.Example1;

public class Employee
{
    int empId;
    String empName;
    static String empCompanyName = "CTS";

    Employee(int empId, String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }

    void display()
    {
        System.out.println("======= Employee Details ========");
        System.out.println("Employee ID :: "+empId);
        System.out.println("Employee Name :: "+empName);
        System.out.println("Employee Company Name :: "+empCompanyName);
    }

}
