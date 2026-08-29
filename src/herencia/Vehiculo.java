package herencia;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double velocidadMaxima;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar() {
        System.out.println(marca + " " + modelo + " está acelerando.");
    }

    public void frenar() {
        System.out.println(marca + " " + modelo + " está frenando.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Vel. máx: " + velocidadMaxima + " km/h");
    }
}