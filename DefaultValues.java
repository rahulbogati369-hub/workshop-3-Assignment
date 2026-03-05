public class DefaultValues {

    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Default byte value: " + obj.byteVar);
        System.out.println("Default short value: " + obj.shortVar);
        System.out.println("Default int value: " + obj.intVar);
        System.out.println("Default long value: " + obj.longVar);
        System.out.println("Default float value: " + obj.floatVar);
        System.out.println("Default double value: " + obj.doubleVar);
        System.out.println("Default char value: [" + obj.charVar + "]"); 
        System.out.println("Default boolean value: " + obj.booleanVar);

        
    }
}
