//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Rex", 3);
        Perro perro2 = new Perro("Milka", 2);
        Perro perro3 = new Perro("Zoe",2);

        perro1.setNivelEnergia(80);
        perro1.setNivelHambre(20);
        perro2.setNivelEnergia(60);
        perro2.setNivelHambre(50);

        perro1.jugar();
        perro2.dormir();
        perro2.comer();
        perro3.jugar();
        perro1.jugar();
        perro3.dormir();

        System.out.println(perro1);
        System.out.println(perro2);
        System.out.println(perro3);
    }
}