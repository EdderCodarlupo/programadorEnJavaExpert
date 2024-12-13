/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesgraficaencodigo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {

    // Componentes
    private JTextField textFieldNombre;
    private JTextField textFieldEdad;
    private JButton botonMostrar;

    public MiVentana() {
        // Configuración del JFrame
        setTitle("Mi Ventana con JTextFields y JButton");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Crear los componentes
        textFieldNombre = new JTextField(20);
        textFieldEdad = new JTextField(20);
        botonMostrar = new JButton("Mostrar Datos");

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Agregar los componentes al panel
        panel.add(new JLabel("Nombre:"));
        panel.add(textFieldNombre);
        panel.add(new JLabel("Edad:"));
        panel.add(textFieldEdad);
        panel.add(botonMostrar);

        // Agregar el panel al JFrame
        add(panel);

        // Acción del botón
        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los JTextFields
                String nombre = textFieldNombre.getText();
                String edad = textFieldEdad.getText();

                // Mostrar los datos en un cuadro de mensaje
                JOptionPane.showMessageDialog(MiVentana.this,
                        "Nombre: " + nombre + "\nEdad: " + edad,
                        "Datos Ingresados",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        // Crear la ventana e iniciarla
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MiVentana().setVisible(true);
            }
        });
    }
}

