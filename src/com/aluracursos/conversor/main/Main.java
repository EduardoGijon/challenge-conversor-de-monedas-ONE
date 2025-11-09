package com.aluracursos.conversor.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final ClienteWeb exchangeClient = new ClienteWeb();

    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al conversor de monedas de alura!");
        String convertirDe = "";
        String convertirA = "";
        double cantidad = 0.0;
        int opcion = 0;

        while(true) {
            System.out.println("""
                    Sea bienvenido/a al Conversor de Moneda =]
                    
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasilenio =>> Dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso Colombiano =>> Dolar
                    7) Salir
                    Elija una opcion valida:
                    """);

            try{
                opcion = teclado.nextInt();

                System.out.println("------------------------------------------------------------------------------------------");

                switch(opcion){
                    case 1:
                        convertirDe = "USD";
                        convertirA = "ARS";
                        break;
                    case 2:
                        convertirDe = "ARS";
                        convertirA = "USD";
                        break;
                    case 3:
                        convertirDe = "USD";
                        convertirA = "BRL";
                        break;
                    case 4:
                        convertirDe = "BRL";
                        convertirA = "USD";
                        break;
                    case 5:
                        convertirDe = "USD";
                        convertirA = "COP";
                        break;
                    case 6:
                        convertirDe = "COP";
                        convertirA = "USD";
                        break;
                    case 7:
                        System.out.println("Programa finalizado! hasta la proxima!");
                        return;
                    default:
                        System.out.println("Opcion no valida, por favor seleccione una opcion del 1 al 7.");
                        continue;
                }

                System.out.println("Escribe la cantidad de " + convertirDe + " que deseas convertir a "+ convertirA);
                cantidad = teclado.nextDouble();
                teclado.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Por favor ingrese un numero valido.");
                teclado.nextLine();
                continue;
            }


            ExchangeRateAPIDto exchangeData = exchangeClient.convertirMoneda(convertirDe,convertirA,cantidad);

            // Mostrar los resultados
            System.out.println("\n==========================================================================================");
            System.out.println("RESULTADO DE LA CONVERSIÓN:");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Moneda base: " + exchangeData.base_code());
            System.out.println("Moneda destino: " + exchangeData.target_code());
            System.out.println("Tasa de conversión: " + exchangeData.conversion_rate());
            System.out.println("Resultado: " + cantidad + " " + exchangeData.base_code() + " = " + (cantidad * exchangeData.conversion_rate()) + " " + exchangeData.target_code());
            System.out.println("==========================================================================================\n");

        }
    }
}
