package com.conversordemonedas;

import com.conversordemonedas.modelos.Convertor;
import com.conversordemonedas.modelos.DatosConvertor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        int valor = 0;
        Convertor convertor = new Convertor();
        System.out.println("Bienvenido al conversor de divisas");
        System.out.println("***********************************");

        while(bandera){
            System.out.println("1.Peso Argentino ==> Dolar");
            System.out.println("2.Dolar ==> Peso Argentino");
            System.out.println("3.Real ==> Dolar");
            System.out.println("4.Dolar ==> Real");
            System.out.println("5.Peso Chileno ==> Dolar");
            System.out.println("6.Dolar ==> Peso Chileno");
            System.out.println("7.Salir");
            System.out.println("***************************");
            System.out.println("Elija una opcion: ");
            switch (leer.nextInt()){
                case 1:
                    System.out.println("Ingrese la cantidad a convertir");
                    valor = leer.nextInt();
                    DatosConvertor datos = convertor.conversorDeMonedas("ARS","USD", valor);
                    System.out.println("El valor de " + valor + " ARS corresponde a " + datos.conversion_result() + " USD");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a convertir");
                    valor = leer.nextInt();
                    datos = convertor.conversorDeMonedas("USD","ARS", valor);
                    System.out.println("El valor de " + valor + " USD corresponde a " + datos.conversion_result() + " ARS");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a convertir");
                    valor = leer.nextInt();
                    datos = convertor.conversorDeMonedas("BRL","USD", valor);
                    System.out.println("El valor de " + valor + " BRL corresponde a " + datos.conversion_result() + " USD");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad a convertir");
                    valor = leer.nextInt();
                    datos = convertor.conversorDeMonedas("USD","BRL", valor);
                    System.out.println("El valor de " + valor + " USD corresponde a " + datos.conversion_result() + " BRL");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad a convertir");
                    valor = leer.nextInt();
                    datos = convertor.conversorDeMonedas("CLP","USD", valor);
                    System.out.println("El valor de " + valor + " CLP corresponde a " + datos.conversion_result() + " USD");
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad a convertir");
                    valor = leer.nextInt();
                    datos = convertor.conversorDeMonedas("USD","CLP", valor);
                    System.out.println("El valor de " + valor + " USD corresponde a " + datos.conversion_result() + " CLP");
                    break;
                case 7:
                    System.out.println("Gracias por usar la aplicacion!");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
