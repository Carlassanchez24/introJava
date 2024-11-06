package herencia;

public class Moto extends Vehiculo {

    public Moto(String marca) {
        super(marca);
        this.ruedas = 2;
    }

    @Override
    public void acelerar() {
        this.velocity += 30;
    }

    @Override
    public String toString() {
        return "La moto va a: " + this.velocity + " Km/h";
    }
}