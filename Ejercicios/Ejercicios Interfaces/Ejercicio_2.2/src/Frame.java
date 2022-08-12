import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    private JPanel mainPanel;
    private JPanel resultFT;
    private JPanel firstRow;
    private JButton singBT;
    private JButton porcentBT;
    private JButton oneBT;
    private JButton fourBT;
    private JButton sevenBT;
    private JPanel secondRow;
    private JPanel thirdRow;
    private JPanel fourRow;
    private JButton zeroBT;
    private JButton deleBT;
    private JButton twoBT;
    private JButton fiveBT;
    private JButton eightBT;
    private JButton commaBT;
    private JButton cleanBT;
    private JButton threeBT;
    private JButton sixBT;
    private JButton nineBT;
    private JButton equualBT;
    private JButton divBT;
    private JButton plusBT;
    private JButton lessBT;
    private JButton mulBT;
    private JTextArea showRT;

    private JFrame window = new JFrame("Calculator");

    private void generateWindow() {
        window.setContentPane(mainPanel);
        window.setSize(350, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }


    public Frame() {
        generateWindow();
        // Obtencion de numeros
        zeroBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("0");
            }
        });
        oneBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("1");
            }
        });
        twoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("2");
            }
        });
        threeBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("3");
            }
        });
        fourBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("4");
            }
        });
        fiveBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("5");
            }
        });
        sixBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("6");
            }
        });
        sevenBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("7");
            }
        });
        eightBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("8");
            }
        });
        nineBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("9");
            }
        });

        // Obtencion de operaciones
        cleanBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.setText("");
            }
        });
        divBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("/");
            }
        });
        mulBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("x");
            }
        });
        plusBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("+");
            }
        });
        lessBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("-");
            }
        });
        equualBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("");
            }
        });
        deleBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("/");
            }
        });
        porcentBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("%");
            }
        });
        commaBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append(",");
            }
        });
        singBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRT.append("-");
            }
        });
    }

    public static void main(String[] args) {
        Frame objectOne = new Frame();
    }
}
