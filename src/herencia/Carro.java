package herencia;

public class Carro{
    private Vehiculo vehiculo;
    private int numeroPuertas;

    public Carro(String marca, String modelo, double velocidadMaxima, int numeroPuertas) {
        this.vehiculo = new Vehiculo(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarInfo() {
        vehiculo.mostrarInfo();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
