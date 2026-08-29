package herencia;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, double velocidadMaxima, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    } public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}
