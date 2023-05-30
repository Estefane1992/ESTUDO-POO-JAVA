package contabanco;

public class ContaoBanco {
    public int numeroConta;
    protected String tipoConta;
    private String titular;
    private double saldo;
    private boolean status;


    //    MÉTODOS PERSONALIZADOS
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    //    ABRIR CONTA
    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if (tipoConta.equals("Conta Corrente")) {
            this.setSaldo(50);
        } else if (tipoConta.equals("Conta Poupança")) {
            this.setSaldo(150);
        }
        System.out.println("Parabéns " + this.getTitular() + " Conta aberta com sucesso!");
    }
    //    FECHAR CONTA
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois possui saldo");
        } else if (this.getSaldo() < 0 ) {
            System.out.println("Conta não pode ser fechada pois possui débitos");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    //    DEPOSITAR
    public void depositar(double valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getTitular());
        } else {
            System.out.println("Impossível depositar em uma conta encerrada!");
        }
    }
    //    SACAR
    public void sacar( double valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso da conta de " + this.getTitular());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta encerrada!");
        }
    }
    //    PAGAR MENSALIDADE
    public  void pagarMensalidade() {
        int valor = 0;
        if (this.getTipoConta().equals("Conta Corrente")) {
            valor = 12;
        } else if (this.getTipoConta().equals("Conta Poupança")) {
            valor = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getTitular());
        } else {
            System.out.println("Impossível pagar mensalidade de uma conta encerrada!");
        }
    }

    //    Metodo Construtor
    public ContaoBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    //    METODOS GETTERS	E	SETTERS

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    //   ****************************************
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    //    ********************************************
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    //    *******************************************************
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //    ***********************************************
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }



}
