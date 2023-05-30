package PolimorfismoSobrecarga;

public class CriarAnimais {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir(true);
        c.reagir(false);
    }
}
