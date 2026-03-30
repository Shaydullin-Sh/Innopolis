package org.example;

import binar_Cod.ConvertBinCod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int number = ConvertBinCod.convertBinaryToDecimal("100110");
        System.out.println(number);
        int number2 = 110;
        String binary = ConvertBinCod.convertDecimalToBinary(number2);
        System.out.println(binary);
    }
}
