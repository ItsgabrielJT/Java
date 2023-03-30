import controlador.LoginController;

public class Principal
{
    public static void main(String[] args) {
        // Estructura del rpoyecto
        // Siempre hay que tener por separada la creacion de las clases Ventanas
        // POr ello creamos clases que controlen esas ventanas
        // Tambien hay que tener una clase principal que maneje las ventanas por medio de esos controladores

        // Como organizar el codigo de las aciones de las clases
        // Es bueno que cada accion que haga un boton o entrada tambien sean anejados por los controaldores

        LoginController login = new LoginController();
        login.mostrarVenatanaLogin();
    }
}
