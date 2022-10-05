package com.contaBanco;
import java.util.Random;

public class Banco {
    private Integer numConta;       //ok
    protected String tipo;            //ok
    private String dono;              //ok
    private Double saldo;             //ok
    private Boolean status;          //not ok
    private Double mensalidade;    //ok
    
    //Sortear numConta
    Random num = new Random();
    
    //Construtor - ok!
    public Banco()
    {
        this.numConta = num.nextInt(10000000);
        this.tipo = "false";
        this.saldo = 0.0;
    }
    
    //Abrindo conta - ok!
    public void abrirConta(String tipo, String dono)
    {
        setDono(dono);
        this.setTipo(tipo);
        this.setStatus(true);
        
        if("CP".equals(tipo)){
            this.setSaldo(150.00);
            this.setMensalidade(20.00);
        }
        else if("CC".equals(tipo)){
            this.setSaldo(50.00);
            this.setMensalidade(12.00);
        }
    }
    
    //Fechar conta - 
    public void fecharConta()
    {
        if(this.getSaldo() > 0 || this.getSaldo() < 0){
            System.out.println("Conta possui dinheiro ou está negativa. Não é possível encerrá-la!\n");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta foi desativada!\n");
        }
    }
    
    //Depositar dinheiro - ok!
    public void depositar(Double deposito){
        if(this.getStatus() == true){
            this.saldo += deposito;
            System.out.println("Deposito realizado com sucesso!\n");
        }
        else{
            System.out.println("Conta não está ativa.\n");
        }
    }
    
    //Sacar valor
    public void sacar(Double valordesejado){
        if(this.getStatus() == true){
            if(this.getSaldo() > 0 && this.getSaldo() >= valordesejado)
            {
                setSaldo(this.getSaldo() - valordesejado);
                System.out.println("Saque realizado com sucesso!\n");
            }
            else
            {
                System.out.println("Conta não possui valor desejado.\n");
            }
        }
        else
        {
            System.out.println("Conta não está ativa.\n");
        }
    }
    
    //Pagamento de mensalidade
    public void pagamentoMensalidade(){
        if(getStatus() == true){
            if(this.getSaldo() >= this.getMensalidade())
            {
                this.setSaldo(this.getSaldo() - this.getMensalidade());
                System.out.println("Mensalidade paga com sucesso.\n Conta: " +this.numConta +"\n Usuário: "+this.dono+"\n");
            }
            else{
                System.out.println("Conta não possui dinheiro suficiente para pagar a mensalidade\n");
            }
        }
        else{
            System.out.println("Conta não está ativa.\n");
        }
    }
    
    //Dados da conta
    public void estadoconsulta()
    {
        System.out.println("Conta: "+this.numConta);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Dono: "+this.dono);
        System.out.println("Saldo: R$"+this.saldo);
        System.out.println("Status: "+this.status);
        System.out.println("Mensalidade: "+this.mensalidade+"\n");
    }

    //Sets
    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
    //Gets
    public Integer getNumConta() {
        return numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public String getDono() {
        return dono;
    }
    public Double getSaldo() {
        return saldo;
    }
    public Boolean getStatus() {
        return status;
    }
    public Double getMensalidade() {
        return mensalidade;
    }
}
