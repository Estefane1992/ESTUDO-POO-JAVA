package contabanco;

import contabanco.ContaoBanco;

public class CriarContas {
    public static void main(String[] args) {
        ContaoBanco pessoa1 = new ContaoBanco();
        pessoa1.setNumeroConta(2020);
        pessoa1.setTitular("Julia");
        pessoa1.abrirConta("Conta Corrente");



        ContaoBanco pessoa2 = new ContaoBanco();
        pessoa2.setNumeroConta(3030);
        pessoa2.setTitular("Maria");
        pessoa2.abrirConta("Conta Poupança");

        pessoa1.depositar(100);
        pessoa2.depositar(500);
        pessoa2.sacar(100);

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
}
