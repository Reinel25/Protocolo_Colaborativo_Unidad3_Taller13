package Ejercicio1;

public class MainPrueba {
    public static void main(String[] args) {

        Rectangulo rec = new Rectangulo( 5, 6);
        Triangulo tri = new Triangulo(4, 6);

        rec.mostrarFigura();
        System.out.println("El area del rectangulo es: " + rec.calcularArea());
        System.out.println();

        tri.mostrarFigura();
        System.out.println("El area del triangulo es: " + tri.calcularArea());
    }
}
