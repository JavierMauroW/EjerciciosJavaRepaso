package org.example;/*

package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 50000;
        int opcion;

        do {
            System.out.println("Bienvenido al Cajero Automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Su saldo actual es: $" + saldo);
                case 2 -> {
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Se han depositado: $" + deposito);
                    } else {
                        System.out.println("La cantidad a depositar debe ser mayor que cero.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Se han retirado: $" + retiro);
                    } else if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        System.out.println("La cantidad a retirar debe ser mayor que cero.");
                    }
                }
                case 4 -> System.out.println("Gracias por usar el Cajero Automático. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}
*/

/*
import java.util.Scanner;

public class Main {


    public static double fahrenheitToCelsius(double F) {
        return (5.0 * (F - 32)) / 9.0;
    }


    public static double celsiusToFahrenheit(double C) {
        return (9.0 * C) / 5.0 + 32;
    }


    public static double celsiusToKelvin(double C) {
        return C + 273.15;
    }


    public static double kelvinToCelsius(double K) {
        return K - 273.15;
    }


    public static double kelvinToFahrenheit(double K) {
        return (9.0 * (K - 273.15)) / 5.0 + 32;
    }


    public static double fahrenheitToKelvin(double F) {
        return (5.0 * (F - 32)) / 9.0 + 273.15;
    }

    public static double celsiusToRankine(double C) {
        return (9.0 * C) / 5.0 + 491.67;
    }

    public static double rankineToCelsius(double Ra) {
        return (5.0 * (Ra - 491.67)) / 9.0;
    }

    public static double rankineToFahrenheit(double Ra) {
        return Ra - 459.67;
    }
    public static double fahrenheitToRankine(double F) {
        return F + 459.67;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona la conversión:");
        System.out.println("1. Fahrenheit a Celsius");
        System.out.println("2. Celsius a Fahrenheit");


        int choice = scanner.nextInt();
        double temperature;

        switch (choice) {
            case -> 1 {

                System.out.print("Ingresa la temperatura en Fahrenheit: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperatura en Celsius: " + fahrenheitToCelsius(temperature));
            }
            case -> 2 {
                System.out.print("Ingresa la temperatura en Celsius: ");
                temperature = scanner.nextDouble();
                System.out.println("Temperatura en Fahrenheit: " + celsiusToFahrenheit(temperature));
            }

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

               String[] productos = {"Mantecada", "Coca Cola", "Chocolates", "Galletas", "Agua"};
        double[] precios = {1.50, 1.00, 2.00, 1.25, 0.75};

        double totalCompra = 0;
        int contadorProductos = 0;

        System.out.println("Bienvenido a la máquina del podeeer!");

        while (contadorProductos < 5) {


            System.out.println("\nProductos disponibles:");
            for (int i = 0; i < productos.length; i++) {
                System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);


            }
            System.out.println("6. Salir");
            System.out.print("Seleccione un producto (1-6): ");
            int seleccion = scanner.nextInt();

            switch (seleccion) {
                case
                            1, 2, 3, 4, 5 -> {
                      totalCompra += precios[seleccion - 1];
                    contadorProductos++;
                    System.out.println("Producto agregado: " + productos[seleccion - 1]);
                }
                case 6 -> {
                    System.out.println("Saliendo...");
                    return;
                }
default -> System.out.println("Selección inválida. Intente de nuevo.");
            }
        }

      double dineroIngresado = 0;

        if (dineroIngresado < totalCompra) {
            System.out.println("No tiene money.");
        } else {
            double cambio = dineroIngresado - totalCompra;
            System.out.printl("Compra exitosa! Su cambio es: , cambio);
        }

        scanner.close();
    }
}