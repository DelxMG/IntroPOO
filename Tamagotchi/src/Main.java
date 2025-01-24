import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Perro rex = new Perro("Rex", 3);
        Perro milka = new Perro("Milka", 2);
        Perro zoe = new Perro("Zoe",2);

        boolean salir = false;
        int menu = 0;

        try {
            while (!salir){

                System.out.println("1. ¿Qué quieres hacer?");
                System.out.println("2. Interactuar con rex");
                System.out.println("3. Interactuar con zoe");
                System.out.println("3. Interactuar con milka");
                System.out.println("4. Ver el estado de ambos");
                System.out.println("5. Salir");

                menu = sc.nextInt();

                switch (menu){
                    case 1:
                        rex.interactuarConPerro(rex, sc);
                        break;
                    case 2:
                        milka.interactuarConPerro(milka, sc);
                        break;
                    case 3:
                        zoe.interactuarConPerro(zoe,sc);
                    case 4:
                        System.out.println(rex);
                        System.out.println(milka);
                        System.out.println(zoe);
                        break;
                    case 5:
                        System.out.println("Saliendo del juego...");
                        salir = true;
                }
            }

        }catch (InputMismatchException e){
            System.out.println("Tipo de dato no válido.");
            sc.next();
        }

    }
}