package PolimorfismoSobrecarga;

public class Mamifero extends Animal {
    protected String corPelo;
    @Override
    public void emitirSom() {
        System.out.println("Emitir som de Mamífero");

    }
}
