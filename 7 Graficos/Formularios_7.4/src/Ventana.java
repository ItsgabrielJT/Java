import javax.swing.*;

public class Ventana
{
    private JPanel mainPanel;
    private JButton button1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton button2;

    public Ventana() {
        JFrame objetos = new JFrame("Calculator");
        objetos.setContentPane(mainPanel);
        objetos.setSize(600, 300);
        objetos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objetos.setVisible(true);
        objetos.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Ventana nuevo = new Ventana();
    }
}
