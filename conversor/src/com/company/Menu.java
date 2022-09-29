package com.company;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();

        System.out.println("Informe o valor do dolar:");
        ConversorDeMoeda.valorDolar = sc.nextDouble();
        System.out.println("Quantos dolares deseja comprar?");
        ConversorDeMoeda.valorReal = sc.nextDouble();

        System.out.println(conversorDeMoeda.convercao());

    }
}