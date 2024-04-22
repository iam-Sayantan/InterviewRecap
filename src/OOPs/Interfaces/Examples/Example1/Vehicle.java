package OOPs.Interfaces.Examples.Example1;

interface Vehicle
{
//    int tyres; // This will provide error since any variable in interface has an access specifier of "public static final" and final variables needs to be initialized.
//    int tyres = 4; //Thus, any variable should be initialised always
    void start();
    void changeGear(int a);
}
