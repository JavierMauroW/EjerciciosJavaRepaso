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