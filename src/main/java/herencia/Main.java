package herencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        //metodo que aga start() a una carrera de vehiculos -> todos los vehiculos aceleran

        //una clase race ->
        //que al crearla cree un peloton de vehiculos
        //metodo star() que todos los vehiculos del peloton aceleren

        List<Vehiculo> peloton = List.of(new Camion("Camion"), new Car("Car"), new Moto("Moto"));

        Race race = new Race(peloton);
        race.start();
    }
}
