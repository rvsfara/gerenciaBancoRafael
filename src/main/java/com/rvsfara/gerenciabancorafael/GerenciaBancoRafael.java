/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rvsfara.gerenciabancorafael;

import com.rvsfara.gerenciabancorafael.model.Cliente;
import com.rvsfara.gerenciabancorafael.model.Conta;
import com.rvsfara.gerenciabancorafael.model.ContaCorrente;
import com.rvsfara.gerenciabancorafael.model.ContaPoupanca;
import java.util.Scanner;

/**
 *
 * @author rvsfara
 */
public class GerenciaBancoRafael {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cliente c1 = new Cliente("080.681.989-89", "Rafael ", "Vieira dos Santos");
        Conta cc = new ContaCorrente(01, Double.valueOf(1991), 1200.0, c1);
        Conta cp = new ContaPoupanca(01, Double.valueOf(2109), 3200.0, c1);
        Scanner entrada = new Scanner( System.in );
        Scanner valor;
        int condicao = 0;
        do {            
            System.out.println(" Bem Vindo ao Banco, Digite 1 para Depositar, 2 para Tranferir, 3 para Saque" );
            System.out.println(" 4 para Extrato, 5 para Operação Padrão ou 6 para Sair ");
            condicao = entrada.nextInt();
            switch (condicao){
            case 1 -> {
                    System.out.println("Digite o Valor que deseja depositar: ");
                    valor = new Scanner( System.in );
                    cc.depositar(valor.nextDouble());
                }
            case 2 -> {
                    System.out.println("Digite o Valor que deseja transferir: ");
                    valor = new Scanner( System.in );
                    cc.transferir(valor.nextDouble(), cp);
                }
            case 3 -> {
                System.out.println("Digite o Valor que deseja retirar: ");
                    valor = new Scanner( System.in );
                    cc.sacar(valor.nextDouble());
                }
            case 4 -> {
                cc.imprimirExtrato();
                cp.imprimirExtrato();
                }
            case 5 -> {
                cc.depositar(100);
                cc.transferir(300, cp);
                cc.sacar(100);
                cc.imprimirExtrato();
                cp.imprimirExtrato();
            }
            default -> {
                    condicao = 4;
                }
            }
            } while ( condicao != 4 );
         System.out.println(" Tenha um bom dia ");
    }
}
