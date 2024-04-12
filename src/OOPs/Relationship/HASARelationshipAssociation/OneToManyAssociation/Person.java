package OOPs.Relationship.HASARelationshipAssociation.OneToManyAssociation;

public class Person
{
    String personName;
    Banks[] bank;

    public Person(String name, Banks[] bank) {
        this.personName = name;
        this.bank = bank;
    }

    public void showBankDetails()
    {
        System.out.println("Person Name - "+personName);
        System.out.println("Banks");
        for (int i=0; i< bank.length;i++)
        {
            System.out.println("Bank name - "+bank[i].name+" & Bank number - "+bank[i].number);
        }
    }
}
