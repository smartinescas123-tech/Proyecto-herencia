package herencia;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, double velocidadMaxima, boolean tieneSidecar) {
        super(marca, modelo, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }
public void acelerar() {
        System.out.println(marca + " " + modelo + " acelera rápidamente por ser más liviana.");
    }
}
