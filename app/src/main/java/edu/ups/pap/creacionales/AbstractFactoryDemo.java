
package edu.ups.pap.creacionales;

public class AbstractFactoryDemo {

    static class FabricaUrbana implements FabricaVehiculos {

        @Override
        public Vehiculo crearCarro() {
            return new Carro();
        }

        @Override
        public Vehiculo crearMoto() {
            return new Moto();
        }
    }

    static class FabricaDeportiva implements FabricaVehiculos {

        @Override
        public Vehiculo crearCarro() {
            return new Carro();
        }

        @Override
        public Vehiculo crearMoto() {
            return new Moto();
        }
    }

    public static void ejecutar() {

        FabricaVehiculos fabrica = new FabricaUrbana();

        Vehiculo carro = fabrica.crearCarro();
        Vehiculo moto = fabrica.crearMoto();

        carro.mostrar();
        moto.mostrar();

        System.out.println("Patron Abstract Factory ejecutado");
    }
}
