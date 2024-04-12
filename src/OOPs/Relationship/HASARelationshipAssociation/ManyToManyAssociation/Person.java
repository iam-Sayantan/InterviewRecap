package OOPs.Relationship.HASARelationshipAssociation.ManyToManyAssociation;

public class Person
{
    String name;
    Language[] lang;

    public Person(String name, Language[] lang) {
        this.name = name;
        this.lang = lang;
    }

    public void showDetails()
    {
        System.out.println("++++++++++++");
        System.out.println("Name : "+name);
        System.out.println("Language Details : ");
        for (int i = 0; i< lang.length; i++)
        {
            System.out.println("Language Name : "+lang[i].langname+ " Language Code : "+lang[i].code);
        }
        System.out.println("++++++++++++");
    }
}
