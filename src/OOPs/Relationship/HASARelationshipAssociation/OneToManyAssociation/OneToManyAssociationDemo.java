package OOPs.Relationship.HASARelationshipAssociation.OneToManyAssociation;

public class OneToManyAssociationDemo
{
    public static void main(String[] args)
    {
        Courses c1 = new Courses("2020","CSE");
        Courses c2 = new Courses("CSE","C");
        Courses c3 = new Courses("CSE","Python");
        Courses c4 = new Courses("CSE","C++");

        Courses[] courses1 = {c1,c2,c3,c4};

        Student s1 = new Student("101","Sayantan",courses1);
        s1.showStudentDetails();

        Courses c5 = new Courses("CSE","HTML");
        Courses c6 = new Courses("CSE","CSS");
        Courses c7 = new Courses("CSE","Go");
        Courses c8 = new Courses("CSE","R");

        Courses[] courses2 = {c5, c6, c7, c8};

        Student s2 = new Student("102","Subho",courses2);
        s2.showStudentDetails();

        System.out.println("======================================================");
        Banks sbi = new Banks("sbi","123");
        Banks ubi = new Banks("ubi","234");
        Banks icici = new Banks("ICICI","222");

        Banks[] bank1 = {sbi,ubi,icici};

        Person p1 = new Person("abc",bank1);
        p1.showBankDetails();

    }
}
