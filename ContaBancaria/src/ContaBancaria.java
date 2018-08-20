/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lipe
 */
public abstract class ContaBancaria {
    
    public int numeroDeConta;
    public double saldo;
    public String historico;

    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(int numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    
    public abstract  void levantar();
    
    public abstract void depositar();
    @Override
    public String toString() {
        return "numero de Conta" + numeroDeConta + ", tipo=" + saldo + ", Historico=" + historico + '}';
    }
}
