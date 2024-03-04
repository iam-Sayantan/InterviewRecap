package ProgrammingFundamentals.DataTypes;

public class WrapperClassDemo1
{
    /*

        public static void main(String[] args) {
        int primitiveValue = 10;
        Integer objectValue = Integer.valueOf(10);

        System.out.println("Before:");
        System.out.println("Primitive Value: " + primitiveValue);
        System.out.println("Object Value: " + objectValue);

        modifyValues(primitiveValue, objectValue);

        System.out.println("After:");
        System.out.println("Primitive Value: " + primitiveValue);
        System.out.println("Object Value: " + objectValue);
    }

    public static void modifyValues(int primitiveValue, Integer objectValue) {
        primitiveValue += 10; // This won't affect the original primitive value.

        // Attempt to change the Integer object's value
        objectValue = Integer.valueOf(objectValue.intValue() + 10); // This creates a new Integer object but won't affect the original object outside this method.
    }

     */


        public static void main(String[] args) {
            int primitiveValue = 10;
            IntegerWrapper objectValue = new IntegerWrapper(primitiveValue);

            System.out.println("Before:");
            System.out.println("Primitive Value: " + primitiveValue);
            System.out.println("Object Value: " + objectValue.getValue());

            modifyValues(primitiveValue, objectValue);

            System.out.println("After:");
            System.out.println("Primitive Value: " + primitiveValue);
            System.out.println("Object Value: " + objectValue.getValue());
        }

        public static void modifyValues(int primitiveValue, IntegerWrapper objectValue) {
            primitiveValue += 10; // This won't affect the original primitive value.

            objectValue.setValue(objectValue.getValue() + 10); // This will change the original object's value.

            // Trying to reassign objectValue to a new IntegerWrapper
            objectValue = new IntegerWrapper(30); // This won't affect the original reference outside this method.
            System.out.println("new instance of objectValue: "+objectValue.getValue());
        }
    }

    class IntegerWrapper {
        private int value;

        public IntegerWrapper(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
