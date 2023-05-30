package heranca;

public class CriandoPessoas {
    public static void main(String[] args) {
//        Visitante v1 = new Visitante();
//        v1.setNome("Juca");
//        v1.setIdade(25);
//        v1.setSexo("M");
//        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setMatricula(2154);
        a1.setCurso("Enfermagem");
        a1.setIdade(25);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        //----------------------
        Bolsista b1 = new Bolsista();
        b1.setMatricula(13547);
        b1.setNome("Juka");
        b1.setBolsa(50);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }
}
