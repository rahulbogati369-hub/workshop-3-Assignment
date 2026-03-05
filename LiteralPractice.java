public class LiteralPractice {
    public static void main(String[] args) {

        // 1. Long literal requires 'L' suffix
        long longVar = 9876543210L;
        System.out.println("Long value: " + longVar);

        // 2. Float literal requires 'f' suffix
        float floatVar = 12.34f;
        System.out.println("Float value: " + floatVar);

        // 3. Char literal using Unicode escape sequence for © symbol
        char charVar = '\u00A9';
        System.out.println("Char value (Unicode ©): " + charVar);
    }
}
