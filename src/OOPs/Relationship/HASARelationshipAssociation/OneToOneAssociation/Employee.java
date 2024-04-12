package OOPs.Relationship.HASARelationshipAssociation.OneToOneAssociation;

public class Employee
{
    String empId;
    String empName;
    Address addr;

    public Employee(String empId, String empName, Address addr)
    {
        this.empId=empId;
        this.empName=empName;
        this.addr=addr;
    }

    public void showEmployeeDetails()
    {
        System.out.println("=======================");
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Address :: ");
        System.out.println("Location : "+addr.location);
        System.out.println("City : "+addr.city);
        System.out.println("State : "+addr.state);
        System.out.println("=======================");
    }
}
