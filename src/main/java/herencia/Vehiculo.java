package herencia;

public abstract class Vehiculo {
    private String marca;
    protected int velocity;
    protected int ruedas;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocity = 0;
    }

    public abstract void acelerar();

    public String getMarca() {
        return marca;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getRuedas() {
        return ruedas;
    }
}
