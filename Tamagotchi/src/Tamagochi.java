import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Tamagochi {
    protected String nombre;
    protected int edad;
    protected int nivelEnergia;
    protected int nivelHambre;
    protected String estadoAnimo;

    public Tamagochi (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelEnergia = 100;
        this.nivelHambre = 0;
        this.estadoAnimo = "Feliz";
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getnivelHambre(){
        return nivelHambre;
    }

    public int getNivelEnergia(){
        return nivelEnergia;
    }

    public String getEstadoAnimo(){
        return estadoAnimo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setEstadoAnimo(String estadoAnimo){
        this.estadoAnimo = estadoAnimo;
    }

    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia = nivelEnergia;
    }

    public void setNivelHambre (int nivelHambre){
        this.nivelHambre = nivelHambre;
    }

    public void interactuarConTamagochi (Tamagochi tamagochi, Scanner sc) {

        boolean salir = false;
        int menu;

        try {

            while (!salir) {
                System.out.println(tamagochi.getNombre() + "te da una cálida bienvenida");
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1.Darle de comer");
                System.out.println("2. Jugar con " + tamagochi.getNombre());
                System.out.println("3. Descansar");
                System.out.println("4. Ver su estado");
                System.out.println("5. Salir");

                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        tamagochi.comer();
                        break;
                    case 2:
                        tamagochi.jugar();
                        break;
                    case 3:
                        tamagochi.dormir();
                        break;
                    case 4:
                        System.out.println(tamagochi.getEstadoAnimo());
                        break;
                    case 5:
                        System.out.println(tamagochi.getNombre() + " espera volver a verte pronto");
                        salir = true;
                        break;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Tipo de dato no válido");
            sc.next();
        }
    }

    public void comer() {
        if (getnivelHambre() > 20){
            setNivelHambre(getnivelHambre() - 20);
            System.out.println(getNombre() + " ha comido y ahora se siente mejor. Su nivel de hambre es de: " + nivelHambre);
        } else {
            System.out.println(getNombre() + " aún no tiene hambre.");
        }
        actualizarEstadoAnimo();
    }

    public void jugar() {

        if (getNivelEnergia() > 0){

            setNivelEnergia(getNivelEnergia() - 20);
            setNivelHambre(getnivelHambre() + 20);

            System.out.println(getNombre() + " esta jugando y se divierte.");
        } else {
            System.out.println(getNombre() + " esta demasiado cansado para jugar");
        }
        actualizarEstadoAnimo();
    }

    public void dormir () {
        if (getNivelEnergia() > 50){
            System.out.println(getNombre() + " no está cansado");
        } else {
            setNivelEnergia(getNivelEnergia() + 20);
            System.out.println(getNombre() + " está recargando energías");
        }
        actualizarEstadoAnimo();
    }

    private void actualizarEstadoAnimo() {
        if (getNivelEnergia() <= 30) {
            setEstadoAnimo("Cansado");
        } else if (getnivelHambre() > 40) {
            setEstadoAnimo("Hambriento");
        } else if (getNivelEnergia() > 50 && getnivelHambre() <= 20) {
            setEstadoAnimo("Feliz");
        } else {
            setEstadoAnimo("Neutral");
        }
    }

    public abstract void hacerRuido();


    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
                "Edad: " + getEdad() + " años\n" +
                "Energía: " + getNivelEnergia() + "\n" +
                "Hambre: " + getnivelHambre() + "\n" +
                "Estado de ánimo: " + getEstadoAnimo() + "\n";
    }
}
