package gui;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame1 extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JTextField txtN1 = new JTextField();
    private JTextField txtN2 = new JTextField();
    private JTextField txtResultado = new JTextField();
    private JButton btnNuevo = new JButton();
    private JButton btnSumar = new JButton();
    private JButton btnVolver = new JButton();
    private JButton btnResta = new JButton();
    private JButton btndividir = new JButton();
    private JButton btnMulti = new JButton();

    public Frame1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle("EJERCICIO 1");
        jLabel1.setText("NUMERO 1");
        jLabel1.setBounds(new Rectangle(10, 40, 75, 15));
        jLabel1.setFont(new Font("Comic Sans MS", 0, 14));
        jLabel1.setForeground(new Color(33, 33, 255));
        jLabel2.setText("NUMERO 2");
        jLabel2.setBounds(new Rectangle(10, 80, 75, 15));
        jLabel2.setFont(new Font("Comic Sans MS", 0, 14));
        jLabel2.setForeground(new Color(33, 33, 255));
        jLabel3.setText("RESULTADO");
        jLabel3.setBounds(new Rectangle(10, 125, 100, 15));
        jLabel3.setFont(new Font("Comic Sans MS", 0, 14));
        jLabel3.setForeground(new Color(33, 33, 255));
        txtN1.setBounds(new Rectangle(150, 35, 85, 20));
        txtN2.setBounds(new Rectangle(150, 80, 85, 20));
        txtResultado.setBounds(new Rectangle(150, 120, 95, 20));
        btnNuevo.setText("NUEVO");
        btnNuevo.setBounds(new Rectangle(15, 215, 75, 21));
        btnNuevo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnNuevo_actionPerformed(e);
                }
            });
        btnSumar.setText("SUMAR");
        btnSumar.setBounds(new Rectangle(280, 20, 100, 20));
        btnSumar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnSumar_actionPerformed(e);
                }
            });
        btnVolver.setText("VOLVER");
        btnVolver.setBounds(new Rectangle(110, 215, 75, 21));
        btnVolver.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnVolver_actionPerformed(e);
                }
            });
        btnResta.setText("RESTAR");
        btnResta.setBounds(new Rectangle(280, 65, 100, 20));
        btnResta.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnResta_actionPerformed(e);
                }
            });
        btndividir.setText("DIVIDIR");
        btndividir.setBounds(new Rectangle(280, 105, 100, 20));
        btndividir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btndividir_actionPerformed(e);
                }
            });
        btnMulti.setText("MULTIPLICAR");
        btnMulti.setBounds(new Rectangle(280, 150, 100, 20));
        btnMulti.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    btnMulti_actionPerformed(e);
                }
            });
        this.getContentPane().add(btnMulti, null);
        this.getContentPane().add(btndividir, null);
        this.getContentPane().add(btnResta, null);
        this.getContentPane().add(btnVolver, null);
        this.getContentPane().add(btnSumar, null);
        this.getContentPane().add(btnNuevo, null);
        this.getContentPane().add(txtResultado, null);
        this.getContentPane().add(txtN2, null);
        this.getContentPane().add(txtN1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void btnSumar_actionPerformed(ActionEvent e) {
        //declaracion de variables
        int n1, n2;
        double re;
              
        //Asignacion de datos a las variables
        n1 = Integer.parseInt(txtN1.getText());
        n2 = Integer.parseInt(txtN2.getText());
        
        // Procedimiento
        re= n1+n2;
        
        //devolver valores a las cajas de texto
        
        txtResultado.setText (""+ re);
    }

    private void btnResta_actionPerformed(ActionEvent e) {
        int n1, n2;
        double re;
        
        n1=Integer.parseInt(txtN1.getText());
        n2=Integer.parseInt(txtN2.getText());
        
        re = n1 - n2;
        
        txtResultado.setText("" + re);
    }

    private void btndividir_actionPerformed(ActionEvent e) {
        int n1, n2;
        double re;
        
        n1=Integer.parseInt(txtN1.getText());
        n2=Integer.parseInt(txtN2.getText());
        
        re = n1 / n2;
        
        txtResultado.setText("" + re);
    }

    private void btnMulti_actionPerformed(ActionEvent e) {
        
      int n1, n2;
      double re;
      
      n1=Integer.parseInt(txtN1.getText());
      n2=Integer.parseInt(txtN2.getText());
      
      re = n1 * n2;
      
      txtResultado.setText("" + re);
    }

    private void btnNuevo_actionPerformed(ActionEvent e) {
        //limpiar campos de texto
        
        txtN1.setText("");
        txtN2.setText("");
        txtResultado.setText("");
        
        txtN1.requestFocus();
        
    }

    private void btnVolver_actionPerformed(ActionEvent e) {
        //salir del formulario
        
        this.dispose(); // cierra el objeto actual.
        // System.exit(0); // cierra la aplicacion.
    }
}
