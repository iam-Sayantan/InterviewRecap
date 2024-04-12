package OOPs.Relationship.HASARelationshipAssociation.OneToManyAssociation;

public class Student
{
    String studentId;
    String studentName;

    Courses[] course;

    public Student(String studentId, String studentName, Courses[] course1)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.course=course1;
    }

    public void showStudentDetails()
    {
        System.out.println("=============");
        System.out.println("Student ID :: "+studentId);
        System.out.println("Student Name :: "+studentName);
        System.out.println("Courses :: ");
        for (int i = 0; i<course.length;i++)
        {
            System.out.println("Course "+(i+1)+" :: "+course[i].courseName+" || batch :: "+course[i].batch);
        }
        System.out.println("===============");
    }
}
