import java.util.InputMismatchException;
import java.util.Scanner;

public class Perro {
    private String nombre;
    private int edad;
    private int nivelEnergia;
    private int nivelHambre;
    private String estadoAnimo;

    public Perro (String nombre, int edad){
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

    public void interactuarConPerro (Perro perro, Scanner sc) {

        boolean salir = false;
        int menu;

        try {

            while (!salir) {
                System.out.println(perro.getNombre() + "te da una cálida bienvenida");
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1.Darle de comer");
                System.out.println("2. Jugar con " + perro.getNombre());
                System.out.println("3. Descansar");
                System.out.println("4. Ver su estado");
                System.out.println("4. Salir");

                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        perro.comer();
                        break;
                    case 2:
                        perro.jugar();
                        break;
                    case 3:
                        perro.dormir();
                        break;
                    case 4:
                        System.out.println(perro.getEstadoAnimo());
                        break;
                    case 5:
                        System.out.println(perro.getNombre() + " espera volver a verte pronto");
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
        if (nivelHambre > 20){
            setNivelHambre(nivelHambre - 20);
            System.out.println(getNombre() + " ha comido y ahora se siente mejor. Su nivel de hambre es de: " + nivelHambre);
        } else {
            System.out.println(getNombre() + " aún no tiene hambre.");
        }
        actualizarEstadoAnimo();
    }

    public void jugar() {

        if (nivelEnergia > 0){

            setNivelEnergia(nivelEnergia -20);
            setNivelHambre(nivelHambre + 20);

            System.out.println(getNombre() + " esta jugando y se divierte.");
        } else {
            System.out.println(getNombre() + " esta demasiado cansado para jugar");
        }
        actualizarEstadoAnimo();
    }

    public void dormir () {
        if (nivelEnergia > 50){
            System.out.println(getNombre() + " no está cansado");
        } else {
            nivelEnergia += 20;
            System.out.println(getNombre() + " está recargando energías");
        }
        actualizarEstadoAnimo();
    }

    private void actualizarEstadoAnimo() {
        if (nivelEnergia <= 30) {
            setEstadoAnimo("Cansado");
        } else if (nivelHambre > 40) {
            setEstadoAnimo("Hambriento");
        } else if (nivelEnergia > 50 && nivelHambre <= 20) {
            setEstadoAnimo("Feliz");
        } else {
            setEstadoAnimo("Neutral");
        }
    }


    @Override
    public String toString() {
        return "Perro: " + nombre + "\n" +
                "Edad: " + edad + " años\n" +
                "Energía: " + nivelEnergia + "\n" +
                "Hambre: " + nivelHambre + "\n" +
                "Estado de ánimo: " + estadoAnimo + "\n";
    }
}
