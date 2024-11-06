package herencia;

public class Camion extends Vehiculo {
    public Camion(String marca) {
        super(marca);
        this.ruedas = 4;

    }

    @Override
    public void acelerar() {
        this.velocity += 60;
    }


    @Override
    public String toString() {
        return "El camion va a: " + this.velocity + " Km/h";
    }

}
