package projetolivros;

public class Leitores {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Juca", 20, "Masculino");
        pessoa[1] = new Pessoa("Maria", 19, "Feminino");

        livro[0] = new Livro("POO", "Guanabara", 200, pessoa[0]);
        livro[1] = new Livro("Desenvolvendo APIs", "Net Poo", 300, pessoa[1]);
        livro[2] = new Livro("Java para iniciantes", "Portela", 200, pessoa[0]);

        livro[0].abrir();
        livro[0].folhear(50);
        System.out.println(livro[0].detalhes());
    }

}
