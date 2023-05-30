package Projeto;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de Java");
        video[1] = new Video("Aula 3 de React");
        video[2] = new Video("Aula 15 de HTML5");

        Usuario usuario[] = new Usuario[2];
        usuario[0] = new Usuario("Marta", 17, "F", "martinha");
        usuario[1] = new Usuario("Julio", 21, "M", "Julio_1");

        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(usuario[0], video[2]);
        visu[0].avaliar();
        System.out.println(visu[0].toString());

        visu[1] = new Visualizacao(usuario[0], video[1]);
        visu[0].avaliar(100);
        System.out.println(visu[1].toString());




    }

}
