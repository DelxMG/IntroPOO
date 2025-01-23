public class Main {

    public static void main(String[] args) {
        Persona contacto1 = new Persona("Juan", "112233", "Perez");

        contacto1.setTelefono("221133");

        System.out.println(contacto1.getName());
        System.out.println(contacto1.getTelefono());

    }
}