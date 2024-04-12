package OOPs.Relationship.HASARelationshipAssociation.ManyToOneAssociation;

public class Student
{
    String name;
    String rollNo;

    Branch branch;

    public Student(String name, String rollNo, Branch branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public void showDetails()
    {
        System.out.println("========");
        System.out.println("Student Name : "+name);
        System.out.println("Roll No "+rollNo);
        System.out.println("Branch Details: ");
        System.out.println("Branch Name : "+branch.branchName);
        System.out.println("Branch Id : "+branch.branchId);
    }
}
