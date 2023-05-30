package Polimorfismo;

public class CriandoAnimal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Cachorro c = new Cachorro();
        Canguro cang = new Canguro();
        Cobra co = new Cobra();
        Arara ara = new Arara();
        GoldFish gol = new GoldFish();


        cang.locomover();
        cang.emitirSom();
        cang.alimentar();

//        c.locomover();
//        c.emitirSom();
//        co.locomover();
//        co.emitirSom();
//        ara.locomover();
//        ara.emitirSom();
//        gol.locomover();
//        gol.emitirSom();
//        gol.soltarBolha();
    }
}
