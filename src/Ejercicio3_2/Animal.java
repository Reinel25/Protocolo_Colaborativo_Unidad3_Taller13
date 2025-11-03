package Ejercicio3_2;

public abstract class Animal {

    public abstract void hacerSonido();

    public void comer() {
        System.out.println("El animal está comiendo, pero esto no es un método 'default' como en interfaces.");
    }
}
