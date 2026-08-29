package herencia;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, double velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
