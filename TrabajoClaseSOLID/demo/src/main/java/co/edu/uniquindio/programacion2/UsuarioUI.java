package co.edu.uniquindio.programacion2;

//Forma correcta

public class UsuarioUI {
    private UsuarioService UsuarioService;

    public UsuarioUI(UsuarioService UsuarioService) {
        this.UsuarioService = UsuarioService;
    }

       //Getters & setters
    public UsuarioService getUsuarioService() {
        return UsuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        UsuarioService = usuarioService;
    }

       // Lógica para mostrar el perfil del usuario en la interfaz de usuario
    public void mostrarPerfil() {
 
    }
        // Lógica para actualizar la interfaz de usuario
    public void actualizarInterfaz() {

    }


}

