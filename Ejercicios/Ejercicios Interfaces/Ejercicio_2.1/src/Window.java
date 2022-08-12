import com.conversos.monedas.Convertidor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private JPanel mainPanel;
    private JLabel titleJf;
    private JPanel contentDiv;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField casillaUno;
    private JTextField casillaDos;
    private JButton botonCV;
    private JButton botonLP;

    JFrame app = new JFrame("Conversor de Divisas");
    Convertidor objeto = new Convertidor();

    private void generateWindow() {
        app.setContentPane(mainPanel);
        app.setSize(600, 300);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setIconImage(getIconImage());
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/transferir-dinero.png"));

        return retValue;
    }

    public Window() {
        generateWindow();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objeto.setOpcionPorConvertir(String.valueOf(comboBox1.getSelectedItem()));
            }
        });
        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objeto.setOpcionAConvertir(String.valueOf(comboBox2.getSelectedItem()));
            }
        });
        casillaUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    objeto.setDinero(Double.parseDouble(casillaUno.getText()));
                }
                catch (NumberFormatException p) {
                    casillaUno.setText("Ingresar puntos y no comas");
                    objeto.setDinero(Double.parseDouble(casillaUno.getText()));
                }
            }
        });
        botonCV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                casillaDos.setText(String.valueOf(objeto.realizarConversion()));
            }
        });
        botonLP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                casillaDos.setText("");
                casillaUno.setText("");
            }
        });
    }
}
