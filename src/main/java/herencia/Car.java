package herencia;

public class Car extends Vehiculo {
    public Car(String marca) {
        super(marca);


    }
    @Override
    public void acelerar() {
        this.velocity += 20;
    }

    @Override
    public String toString() {
        return "El coche va a: " + this.velocity + " Km/h";
    }

}
