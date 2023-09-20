package com.mycompany.calculadoramonedas;

import java.util.Scanner;

public class CalculadoraMonedas {

    public static void main(String[] args) {
        double peso;
        final double dolar = 17.08, yen = 0.12, euro = 18.25, libra = 21.16;
        System.out.println("Ingresa la cantidad en pesos que vas a convertir:");
        Scanner e = new Scanner(System.in);
        peso = e.nextDouble();
        System.out.println("La conversión en Euro es: " + (peso / euro));
        System.out.println("La conversión en Yen es: " + (peso / yen));
        System.out.println("La conversión en libra es: " + (peso / libra));
        System.out.println("La conversión en Dólar es: " + (peso / dolar));
        e.close();
    }
}
