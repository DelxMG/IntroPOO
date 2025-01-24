import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Perro rex = new Perro("Rex", 3);
        Gato michi = new Gato("Michi", 2);

        boolean salir = false;
        int menu = 0;

        try {
            while (!salir){

                System.out.println("¿Qué quieres hacer?");
                System.out.println("1. Interactuar con rex");
                System.out.println("2. Interactuar con milka");
                System.out.println("3. Ver el estado de ambos");
                System.out.println("4. Salir");

                menu = sc.nextInt();

                switch (menu){
                    case 1:
                        rex.interactuarConTamagochi(rex, sc);
                        break;
                    case 2:
                        michi.interactuarConTamagochi(michi, sc);
                        break;
                    case 3:
                        System.out.println(rex);
                        System.out.println(michi);
                        break;
                    case 4:
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