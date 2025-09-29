package com.avatrixxyt.swing;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ReglasYAyuda {
	/**
	 * @wbp.parser.entryPoint
	 */
	public void reglas() {
		JFrame frame = new JFrame("Reglas y Ayuda");
		frame.setResizable(false); // Bloquear redimensionamiento
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(453, 450);
		
		
		JButton Aceptar = new JButton("Aceptar");
		springLayout.putConstraint(SpringLayout.SOUTH, Aceptar, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Aceptar, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(Aceptar);
		
		
		JLabel lblNewLabel = new JLabel("<html>Juego creado con el proposito de mejorar las capacidades matematicas\n<br>de los jugadores, Se recomienda jugar entre 2 jugadores para una mejor\n<br>experiencia de juegos, jugar con un yenga,</html>");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 370, SpringLayout.NORTH, frame.getContentPane());
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 444, SpringLayout.WEST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel);
		
		Aceptar.addActionListener(e -> frame.dispose());
		
		frame.setVisible(true);
	}
}