public class Perro extends Tamagochi {

    public Perro (String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " dice: ¡Guau, guau!");
    }
}
