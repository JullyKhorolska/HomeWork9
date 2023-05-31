public class Main {

    public static void main(String[] args) {

        double value = 102;
        Double doubleValue = Double.valueOf(value);
        Double doubleValue1 = Double.valueOf(45);
        System.out.println("Double type: " + doubleValue);
        System.out.println("Double type: " + doubleValue1 + "\n");

        String str = "76583";
        double strDouble = Double.parseDouble(str);
        System.out.println("String to double: " + strDouble + "\n");

        int dInt = doubleValue.intValue();
        short dShort = doubleValue.shortValue();
        long dLong = doubleValue1.longValue();
        byte dByte = doubleValue.byteValue();
        boolean dBoolean = doubleValue1.isNaN();
        float dFloat = doubleValue.floatValue();

        System.out.println("int: " + dInt);
        System.out.println("short: " + dShort);
        System.out.println("long: " + dLong);
        System.out.println("byte: " + dByte);
        System.out.println("boolean: " + dBoolean);
        System.out.println("float: " + dFloat);


        String d = Double.toString(3.14);
        System.out.println("\nDouble to string: " + d);
        System.out.println("Is value is string? ");
        System.out.println(d instanceof String);
   }
}
