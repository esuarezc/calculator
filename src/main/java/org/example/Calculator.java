package org.example;

public class Calculator {

    public int add(int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }

    public int substract(int numberOne, int numberTwo){
        return numberOne-numberTwo;
    }

    public static int multiplication(int numberOne, int numberTwo){
        return numberOne*numberTwo;
    }

    public static int division(int numberOne, int numberTwo){
        if (numberTwo==0) throw new IllegalArgumentException("No es posible dividir por cero");
        return numberOne/numberTwo;
    }


}
