package br.com.dio.conta;

import br.com.dio.conta.model.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Conta novaConta = new Conta();
        Scanner scn = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        novaConta.setAgencia(scn.next());
        System.out.println("Por favor, digite o número da Conta:");
        novaConta.setConta(scn.nextInt());
        scn.nextLine();
        System.out.println("Por favor, digite o nome do cliente:");
        novaConta.setNomeCliente(scn.nextLine());
        System.out.println("Por favor, digite o saldo da conta:");
        novaConta.setSaldo(scn.nextFloat());

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %o e seu saldo de %.2f já está disponível para saque.",
                    novaConta.getNomeCliente(), novaConta.getAgencia(), novaConta.getConta(), novaConta.getSaldo()));
    }
}
