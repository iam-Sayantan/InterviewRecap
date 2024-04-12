package OOPs.Relationship.HASARelationshipAssociation.OneToOneAssociation;

public class OneToOneAssociationDemo
{
    public static void main(String[] args)
    {
        Address addr1 = new Address("India","Kolkata","West Bengal");
        Employee emp1 = new Employee("101","Sayantan",addr1);
        emp1.showEmployeeDetails();

        Address addr2 = new Address("Austria","Salzburg","NOTA");
        Employee emp2 = new Employee("102","Subho",addr2);
        emp2.showEmployeeDetails();

        Passport pp1 = new Passport("1234","12-12-2099");
        Passport pp2 = new Passport("9999","12-2-3332");

        Person p1 = new Person("ABC","12",pp1);
        p1.showPassportDetails();

        Person p2 = new Person("XYZ","11",pp2);
        p2.showPassportDetails();
    }
}
