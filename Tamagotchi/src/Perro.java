public class Perro {
    String nombre;
    int edad;
    int nivelEnergia;
    int nivelHambre;
    String estadoAnimo;

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


    public void comer() {
        if (nivelHambre > 20){
            nivelHambre -= 20;
            System.out.println(nombre + " ha comido y ahora se siente mejor. Su nivel de hambre es de: " + nivelHambre);
        } else {
            System.out.println(nombre + " aún no tiene hambre.");
        }
    }

    public void jugar() {

        if (nivelEnergia > 0){

            nivelEnergia -= 20;
            nivelHambre += 20;
            estadoAnimo = "Divertido";

            System.out.println(nombre + " esta jugando y se divierte.");
        } else {
            estadoAnimo = "Cansado";
            System.out.println(nombre + " esta demasiado cansado para jugar");
        }
    }

    public void dormir () {
        if (nivelEnergia > 50){
            System.out.println(nombre + " no está cansado");
        } else {
            nivelEnergia += 20;
            estadoAnimo = "Dormido";
            System.out.println(nombre + " está recargando energías");
        }
    }

    private void actualizarEstadoAnimo() {
        if (nivelEnergia <= 0) {
            estadoAnimo = "Cansado";
        } else if (nivelHambre > 40) {
            estadoAnimo = "Hambriento";
        } else if (nivelEnergia > 50 && nivelHambre < 20) {
            estadoAnimo = "Feliz";
        } else if (nivelEnergia > 30 && nivelHambre < 50) {
            estadoAnimo = "Divertido";
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
