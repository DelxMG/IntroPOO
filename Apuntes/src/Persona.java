
public class Persona {

    String name;
    String telefono;
    String apellidos;


    public Persona (String name, String telefono, String apellidos) {
        this.name = name;
        this.telefono = telefono;
        this.apellidos = apellidos;
    }

    public String getName (){
        return name;
    }

    public String getApellidos (){
        return apellidos;
    }

    public String getTelefono (){
        return telefono;
    }

    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
}
