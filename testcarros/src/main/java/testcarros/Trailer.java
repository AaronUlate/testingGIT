package testcarros;

public class Trailer {

    String marca;   
    String modelo;
    int capacidad;

    public Trailer(String marca, String modelo, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

}
