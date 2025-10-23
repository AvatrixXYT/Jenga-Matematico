package com.avatrixxyt.swing;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Respuesta {
	
	Jugando jug = new Jugando();
	
	public void GUICheck(boolean Check) {
		if (Check) {
			Correcto();
		} else {
			Incorrecto();
		}
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	private void Correcto() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(584, 242);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Respuesta Correcta");
		lblNewLabel.setBounds(157, 10, 261, 98);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Sig = new JButton("Siguiente Operacion");
		Sig.setBounds(286, 136, 292, 72);
		frame.getContentPane().add(Sig);
		Sig.addActionListener(e -> {frame.setVisible(false);jug.jugando();});
		
		JButton Salir = new JButton("Salir");
		Salir.setBounds(6, 136, 275, 72);
		frame.getContentPane().add(Salir);
		Salir.addActionListener(e -> {frame.setVisible(false);Inicio.inicio();});
		
		frame.setVisible(true);
	}
	private void Incorrecto() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(584, 242);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		
		JLabel lblNewLabel = new JLabel("Respuesta Incorrecta");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 157, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 108, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 418, SpringLayout.WEST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Sig = new JButton("Siguiente Operacion");
		springLayout.putConstraint(SpringLayout.NORTH, Sig, 28, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, Sig, -121, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(Sig);
		Sig.setBounds(286, 136, 292, 72);
		Sig.addActionListener(e -> {frame.setVisible(false);jug.jugando();});
		
		JButton Salir = new JButton("Salir");
		Salir.setBounds(6, 136, 275, 72);
		springLayout.putConstraint(SpringLayout.NORTH, Salir, 0, SpringLayout.NORTH, Sig);
		springLayout.putConstraint(SpringLayout.WEST, Salir, 109, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(Salir);
		Salir.addActionListener(e -> {frame.setVisible(false);Inicio.inicio();});
		
		frame.setVisible(true);
	}
}
