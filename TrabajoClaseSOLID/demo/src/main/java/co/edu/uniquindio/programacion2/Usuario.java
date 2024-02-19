package co.edu.uniquindio.programacion2;


//Forma incorrecta

public class Usuario {
    // Clase que viola el Single Reponsability Principle al tener múltiples responsabilidades
    private String nombre;
    private String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
            // Getters & setters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Métodos relacionados con la lógica de negocio del usuario
    public void registrarUsuario() {
    }

    public void iniciarSesion() {

    }
    public void mostrarPerfil() {
    }

    public void actualizarInterfaz() {
    }


   





}

