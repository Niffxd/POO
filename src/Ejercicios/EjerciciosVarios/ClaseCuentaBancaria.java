package Ejercicios.EjerciciosVarios;

import Ejercicios.EjerciciosVarios.Persona.ClasePersona;

public class ClaseCuentaBancaria extends ClasePersona {
  private String titular;
  private double saldo;
  private int numeroCuenta;
  private int dias;

  public ClaseCuentaBancaria() {}

  public ClaseCuentaBancaria(String nombre, double saldo, int numeroCuenta) {
    super(nombre);
    this.titular = nombre;
    this.saldo = saldo;
    this.numeroCuenta = numeroCuenta;
    this.dias = 0;
  }

  public void depositar(double valor) {
    this.saldo += valor;
    System.out.println("El saldo actual es: " + this.saldo);
  }

  public void retirar(double valor) {
    this.saldo -= valor;
    System.out.println("El saldo actual es: " + this.saldo);
  }

  public void interesAnual(int dias) {
    this.dias += dias;
    if (this.dias > 365) {
      this.saldo += this.saldo * 1.05;
      // resetear los días
      this.dias = 0;
    }
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

  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }
}
