public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura) { // método Constructor
        this.nome = nome;
        this.idade =idade;
        this.altura = altura;
    }

    public Pessoa() {
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Julia", 21, 1.50  );

        pessoa.apresentar();

    }
    public void apresentar() {
        System.out.println("Eu sou a " + nome + "," + " tenho " + idade + " anos, "   + "minha altura é " + altura + " metros" );

    }
    // Getters e setters dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
