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
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(453, 360);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setLayout(null);
		
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(352, 292, 92, 29);
		frame.getContentPane().add(Aceptar);
		
		
		JLabel lblNewLabel = new JLabel("<html>\nJuego creado por los alumnos de 3A de programacion con el proposito de mejorar las capacidades matematicas de los alumnos y mejorar sus calificaciones en la asignatura de Pensamiento Matematico\n<br><br>\nInstruciones:<br>\n-Jugar de 2 jugadores.<br>\n-Usar un Set Jenga.<br>\n-Al sacar una pieza amarilla ganas 1 punto, azul 2 puntos, amarillo 3.<br>\n-Entre mas putos tengas mas posibilidades de ganar el juego.<br>\n-Usar libreta para las operaciones mas complicadas.<br>\n-Evitar usar calculadora.<br>\n<br><br>\nDesarrollado por:<br>\n-Villalobos Arellano Andres<br>\n-Flores López Valeria<br>\n-Gonzales Ortiz Juan Pablo<br>\n-Garibay Avalos Melinda Denisse<br>\n</html>");
		lblNewLabel.setBounds(10, 10, 434, 270);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel);
		
		Aceptar.addActionListener(e -> frame.dispose());
		
		frame.setVisible(true);
	}
}