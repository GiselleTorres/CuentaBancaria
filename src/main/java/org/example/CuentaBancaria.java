package org.example;

import java.util.Random;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numeroCuenta;
    private Random x =new Random();

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }

    public void depositarDinero(double dd){
        this.saldo+=dd;
    }

    public void retirarDinero(double rd){
        this.saldo-=rd;
    }


}
/*Cuenta Bancaria
Descripción: Crea una clase CuentaBancaria con los atributos titular, saldo, y numeroCuenta.
Implementa métodos para depositar dinero, retirar dinero, y mostrar la información de la cuenta.
En el método main, crea varios objetos de tipo CuentaBancaria, realiza depósitos y retiros,
y muestra la información actualizada*/