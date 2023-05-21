/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rvsfara.gerenciabancorafael.model;

/**
 *
 * @author rvsfara
 */
public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, Double conta, Double saldo, Cliente cliente) {
        super(agencia, conta, saldo, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" Bem Vindo a Sua Conta Poupança: ");
        super.estrato();
    }
    
}
