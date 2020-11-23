import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Thu Nov 12 21:57:32 CET 2020
 */


/**
 * @author unknown
 */
public class Registro extends JPanel {
    public Registro() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        frame1 = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        panel3 = new JPanel();
        label5 = new JLabel();
        passwordField1 = new JPasswordField();
        label6 = new JLabel();
        passwordField2 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();
        panel4 = new JPanel();
        label7 = new JLabel();

        //======== frame1 ========
        {
            frame1.setResizable(false);
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new BorderLayout());

            //======== this ========
            {
                this.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
                .EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder.CENTER,javax
                .swing.border.TitledBorder.BOTTOM,new Font("D\u0069alog", Font.BOLD,
                12), Color.red),this. getBorder()));this. addPropertyChangeListener(new java.beans
                .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".equals(e.
                getPropertyName()))throw new RuntimeException();}});
                this.setLayout(new BorderLayout());

                //======== panel1 ========
                {
                    panel1.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {32, 163, 217, 87, 87, 0, 0};
                    ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
                    ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                    //======== panel2 ========
                    {
                        panel2.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 50, 102, 0, 0};
                        ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
                        ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0E-4};
                        ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- label1 ----
                        label1.setText("Nombre: ");
                        panel2.add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel2.add(textField1, new GridBagConstraints(3, 1, 4, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- label2 ----
                        label2.setText("Apellido");
                        panel2.add(label2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel2.add(textField2, new GridBagConstraints(3, 2, 4, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- label3 ----
                        label3.setText("Cpi");
                        panel2.add(label3, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel2.add(textField3, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));

                        //---- label4 ----
                        label4.setText("Pais");
                        panel2.add(label4, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel2.add(textField4, new GridBagConstraints(5, 3, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));
                    }
                    panel1.add(panel2, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //======== panel3 ========
                    {
                        panel3.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {42, 137, 0, 0};
                        ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                        ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};
                        ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                        //---- label5 ----
                        label5.setText("Pasword");
                        panel3.add(label5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel3.add(passwordField1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));

                        //---- label6 ----
                        label6.setText("pasword");
                        panel3.add(label6, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel3.add(passwordField2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                    }
                    panel1.add(panel3, new GridBagConstraints(3, 1, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- button1 ----
                    button1.setText("Registrar");
                    panel1.add(button1, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.EAST, GridBagConstraints.NONE,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- button2 ----
                    button2.setText("Cancelar");
                    panel1.add(button2, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(0, 0, 5, 5), 0, 0));
                }
                this.add(panel1, BorderLayout.CENTER);

                //======== panel4 ========
                {
                    panel4.setBackground(new Color(102, 102, 102));
                    panel4.setLayout(new FlowLayout());

                    //---- label7 ----
                    label7.setText("Registro");
                    label7.setFont(new Font("JetBrains Mono", Font.BOLD | Font.ITALIC, 22));
                    label7.setHorizontalAlignment(SwingConstants.TRAILING);
                    label7.setHorizontalTextPosition(SwingConstants.CENTER);
                    label7.setBackground(new Color(0, 51, 51));
                    label7.setForeground(new Color(0, 51, 51));
                    panel4.add(label7);
                }
                this.add(panel4, BorderLayout.NORTH);
            }
            frame1ContentPane.add(this, BorderLayout.CENTER);
            frame1.setSize(675, 350);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame frame1;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JPanel panel3;
    private JLabel label5;
    private JPasswordField passwordField1;
    private JLabel label6;
    private JPasswordField passwordField2;
    private JButton button1;
    private JButton button2;
    private JPanel panel4;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
