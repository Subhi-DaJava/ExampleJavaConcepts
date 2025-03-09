package Interface_inheritence.interface_fields_attributes;
/*
Even though the final keyword is not explicitly used, VALUE is implicitly final because it is declared within an interface.
This means its value cannot be modified after it is set to 100.
 */
public interface InterfaceFieldsAttributes {
    int VALUE = 100; // public static final int VALUE = 100;

    static int getValue() {
       // VALUE = VALUE + 10; // Error: Cannot assign a value to final variable 'VALUE'
        return VALUE + 10;
    }

}
