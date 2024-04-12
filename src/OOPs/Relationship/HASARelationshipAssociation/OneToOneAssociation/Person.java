package OOPs.Relationship.HASARelationshipAssociation.OneToOneAssociation;

public class Person
{
    String name;
    String age;
    Passport pass;

    public Person(String name, String age, Passport pass){
        this.name=name;
        this.age=age;
        this.pass = pass;
    }

    public void showPassportDetails()
    {
        System.out.println("=========================");
        System.out.println("Name :: "+name);
        System.out.println("Age :: "+age);
        System.out.println("Passport details :: ");
        System.out.println("Passport number :: "+pass.number);
        System.out.println("Passport Validity :: "+pass.validity);
        System.out.println("=========================");
    }
}
