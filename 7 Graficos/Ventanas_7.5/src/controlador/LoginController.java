package controlador;

import ventanas.*;

public class LoginController
{
    private VentanaLogin ventanaLogin = new VentanaLogin();

    public void mostrarVenatanaLogin() {
        ventanaLogin.setVisible(true);
    }

    public void ocultarVentanaLogin() {
        ventanaLogin.setVisible(false);
    }
}
