package com.company;

public class ConversorDeMoeda {
    public static double valorDolar;
    public static double valorReal;
    public static double converterReal;

    public double convercao(){
        converterReal = (valorReal * valorDolar) * 1.06;
        return converterReal;
    }
}