public class SuperPessoa extends Pessoa{
    String superPoder;

    public SuperPessoa(String nome, int idade, double altura) {

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public static void main(String[] args) {
        SuperPessoa superPessoa = new SuperPessoa("Maria", 30, 1.70 );

        superPessoa.superPoder = "Voar";

        superPessoa.apresentar();
        System.out.println("Super Poder: " + superPessoa.superPoder);
    }
}
