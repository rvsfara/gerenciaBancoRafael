/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rvsfara.gerenciabancorafael.model;

/**
 *
 * @author rvsfara
 */
public abstract class Conta implements IConta{
    private int agencia;
    private Double numero;
    private Double saldo;
    private Cliente cliente;

    public Conta(int agencia, Double conta, Double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numero = conta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public void estrato() {
        System.out.println(" Cliente: "+cliente.getNome()+ " Agencia: "+this.agencia+ " Conta: "+this.numero+ " Saldo: "+this.saldo);
    }
}
