package herencia;

public class Herencia {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro("Mazda", "3", 190, 4);
        vehiculos[1] = new Moto("Yamaha", "MT-03", 170, false);
        vehiculos[2] = new Camion("Kenworth", "T800", 120, 25.5);

 for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            v.acelerar();
            v.frenar();
            System.out.println("-------------------------");
        }
    }
}
       