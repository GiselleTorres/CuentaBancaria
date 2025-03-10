package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<CuentaBancaria> lstCuentaBancaria = new ArrayList<>();

        CuentaBancaria cb1 = new CuentaBancaria("123456789", 1230000, "Diego");
        CuentaBancaria cb2 = new CuentaBancaria("987654321", 234000, "Valentina");
        CuentaBancaria cb3 = new CuentaBancaria("543219876", 5609873, "Laura");
        lstCuentaBancaria.add(cb1);
        lstCuentaBancaria.add(cb2);
        lstCuentaBancaria.add(cb3);

        int a = 0;
        do {
            System.out.println("Ingresa tu numero de cuenta:");
            System.out.println(cb1.getNumeroCuenta());
            System.out.println(cb2.getNumeroCuenta());
            System.out.println(cb3.getNumeroCuenta());

            Scanner teclado = new Scanner(System.in);
            String numeroCuentaIngresada = teclado.nextLine();

            // Verifica si la cuenta ingresada es válida
            CuentaBancaria cuentaSeleccionada = null;
            for (CuentaBancaria cuenta : lstCuentaBancaria) {
                if (cuenta.getNumeroCuenta().equals(numeroCuentaIngresada)) {
                    cuentaSeleccionada = cuenta;
                    break;
                }
            }

            if (cuentaSeleccionada == null) {
                System.out.println("Número de cuenta no válido. Intenta nuevamente.");
                continue;
            }

            System.out.println("*************************************");
            System.out.println("*Elige que deseas hacer en tu cuenta*");
            System.out.println("*1. Depositar                       *");
            System.out.println("*2. Retirar                         *");
            System.out.println("*3. Ver la información de mi cuenta *");
            System.out.println("*************************************");

            a = teclado.nextInt();

            switch (a) {
                case 1: // Depositar dinero
                    System.out.print("Su saldo es: $" + cuentaSeleccionada.getSaldo() + "\n");
                    System.out.print("Ingresa cuanto deseas depositar: ");
                    double deposito = teclado.nextDouble();
                    cuentaSeleccionada.depositarDinero(deposito);
                    System.out.println("¡Depósito exitoso! Nuevo saldo: $" + cuentaSeleccionada.getSaldo());
                    break;

                case 2: // Retirar dinero
                    System.out.print("Su saldo es: $" + cuentaSeleccionada.getSaldo() + "\n");
                    System.out.print("Ingresa cuanto deseas retirar: ");
                    double retiro = teclado.nextDouble();
                    if (retiro <= cuentaSeleccionada.getSaldo()) {
                        cuentaSeleccionada.retirarDinero(retiro);
                        System.out.println("¡Retiro exitoso! Nuevo saldo: $" + cuentaSeleccionada.getSaldo());
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;

                case 3: // Ver la información de la cuenta
                    System.out.println("Información de la cuenta seleccionada:");
                    System.out.println(cuentaSeleccionada);
                    break;
            }

        } while (a != 3); // El ciclo continuará hasta que se elija ver la información de la cuenta

        System.out.println("Gracias por usar el sistema.");
    }
}
