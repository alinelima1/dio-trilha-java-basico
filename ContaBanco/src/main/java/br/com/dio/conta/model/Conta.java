package br.com.dio.conta.model;

public class Conta {
    String nomeCliente;
    String agencia;
    int conta;
    float saldo;

    public Conta() {
    }

    public Conta(String nomeCliente, String agencia, int conta, float saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
