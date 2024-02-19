package co.edu.uniquindio.programacion2;

//Forma correcta

public class UsuarioService {
    private String nombre;
    private String correo;

    public UsuarioService(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

       //Getters & setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

       public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
        // Lógica para registrar al usuario en la base de datos 
    public void registrarUsuario() {
     
    }

    public void iniciarSesion() {
        // Lógica para iniciar sesión del usuario
    }


}
