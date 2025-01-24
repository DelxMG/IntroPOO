public class Gato extends Tamagochi {

    public Gato (String nombre, int edad) {
        super(nombre, edad);
        this.nivelHambre = 50;
        this.nivelEnergia = 50;
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }
}
