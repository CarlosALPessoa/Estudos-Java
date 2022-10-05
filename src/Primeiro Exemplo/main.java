package com.contaBanco;


public class ContaBanco {

    public static void main(String[] args) {
        Banco conta = new Banco();
        conta.abrirConta("CC", "Adriano");
        conta.depositar(150.0);
        conta.estadoconsulta();
        conta.sacar(100.0);
        conta.pagamentoMensalidade();
        conta.sacar(88.0);
        conta.fecharConta();
        conta.estadoconsulta();
        
        Banco conta1 = new Banco();
        conta1.abrirConta("CP", "Flavia");
        
        conta1.estadoconsulta();
    }
}
