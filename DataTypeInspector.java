public class DataTypeInspector {
    public static void main(String[] args) {

        byte byteVar = 120;
        System.out.println("Byte value: " + byteVar);

        short shortVar = 30000;
        System.out.println("Short value: " + shortVar);
        
        int intVar = 123456789;
        System.out.println("Int value: " + intVar);

        long longVar = 9876543210L; 
        System.out.println("Long value: " + longVar);

        float floatVar = 12.34f; 
        System.out.println("Float value: " + floatVar);

        double doubleVar = 123.456;
        System.out.println("Double value: " + doubleVar);

        char charVar = 'A';
        System.out.println("Char value: " + charVar);

        boolean booleanVar = true;
        System.out.println("Boolean value: " + booleanVar);
    }
}