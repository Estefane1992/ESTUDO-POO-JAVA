package Projeto;

public class Usuario extends Pessoa{
    private String login;
    private int totalAssistido;

    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Usuario{" + super.toString() +
                "\n login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
