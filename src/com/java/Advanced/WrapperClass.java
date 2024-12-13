package com.java.Advanced;
/* wrapper class is used to convert primitive data types to objects.
Autoboxing is the automatic conversion of primitive data types to their corresponding wrapper
class objects. Unboxing is the reverse process where wrapper class objects are converted back to
primitive types*/
public class WrapperClass {
    public static void main(String[] args) {
        //Byte example
        Byte byteObject=10; //autoboxing
        byte primitiveByte=byteObject; //unboxing
        System.out.println("Byte object: " + byteObject);
        System.out.println("Primitive byte: " + primitiveByte);

        //methods
        Byte byteValue=Byte.valueOf("20");
        byte parsedByte=Byte.parseByte("30");
        System.out.println("Byte value from String: " + byteValue);
        System.out.println("Parsed byte value: " + parsedByte);

        //Short wrapper class
        Short shortObject=100; //autoboxing
        short primitiveShort=shortObject; //unboxing
        System.out.println("short object: " + shortObject);
        System.out.println("primitive short: " + primitiveShort);

        //methods
        Short shortValue=Short.valueOf("200");
        short parsedShort=Short.parseShort("300");
        System.out.println("short value from string: " + shortValue);
        System.out.println("parsed short value: " + parsedShort);

        //Integer wrapper class
        Integer intObject=1000; //autoboxing
        int primitiveInt=intObject; //unboxing
        System.out.println("Integer object: " + intObject);
        System.out.println("primitive int: " + primitiveInt);

        //methods
        Integer intValue=Integer.valueOf("2000");
        int parsedInt=Integer.parseInt("3000");
        int compareResult=Integer.compare(100,200);
        String binaryString=Integer.toBinaryString(10);
        System.out.println("integer value from string: " + intValue);
        System.out.println("parsed int value: " + parsedInt);
        System.out.println("binary rep of 10: " + binaryString);
        System.out.println("comparison result(100 vs 200): " + compareResult);

        //Long wrapper class
        Long longObject=10000L; //autoboxing
        long primitiveLong=longObject; //unboxing
        System.out.println("long object: " + longObject);
        System.out.println("primitive long: " + primitiveLong);

        //methods
        Long longValue=Long.valueOf("20000");
        long parsedLong=Long.parseLong("30000");
        String hexString=Long.toHexString(255);
        int compareResult1= Long.compare(1000L, 2000L);
        System.out.println("long value from string: " + longValue);
        System.out.println("parsed long value: " + parsedLong);
        System.out.println("Hex rep of 255: " + hexString);
        System.out.println("comparison result (1000L vs 2000L): " + compareResult1);

        //Boolean wrapper class
        Boolean booleanObject=true; //autoboxing
        boolean primitiveBoolean=booleanObject; //unboxing
        System.out.println("boolean object: " + booleanObject);
        System.out.println("primitive boolean: " + primitiveBoolean);

        //methods
        Boolean boolValue=Boolean.valueOf("true");
        boolean parsedBoolean=Boolean.parseBoolean("false");
        System.out.println("boolean value from string: " + boolValue);
        System.out.println("parsed boolean value: " + parsedBoolean);

        //Character wrapper class
        Character charObject='A'; //autoboxing
        char primitiveChar=charObject; //unbox
        System.out.println("char obj: " + charObject);
        System.out.println("prim char: " + primitiveChar);

        //methods
        boolean isDigit=Character.isDigit('5');
        boolean isLetter=Character.isLetter('A');
        char toLowerChase=Character.toLowerCase('B');
        System.out.println("is '5' a digit? " + isDigit);
        System.out.println("is 'A' a letter? " + isLetter);
        System.out.println(" 'B' to lower case:  " + toLowerChase);

        //Double wrapper class
        Double doubleObject=10.55; //autoboxing
        double primitiveDouble=doubleObject; //unbox
        System.out.println("double object: " + doubleObject);
        System.out.println("primitive double: " + primitiveDouble);

        //methods
        Double doubleValue=Double.valueOf("20.55");
        double parsedDouble=Double.parseDouble("30.55");
        int compareResult2=Double.compare(10.55, 20.55);
        System.out.println("double value from string: " + doubleValue);
        System.out.println("parsed double value: " + parsedDouble);
        System.out.println("comp result: " + compareResult2);
    }
}
