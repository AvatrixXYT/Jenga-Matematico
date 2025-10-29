package com.avatrixxyt.swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;

import com.avatrixxyt.logic.*;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class Jugando {
	
	SetDif dif = new SetDif();
	SelOP ops = new SelOP();
	
	ButtonGroup group = new ButtonGroup();
	JFrame frame = new JFrame();
	/**
	 * @wbp.parser.entryPoint
	 */
	public void jugando() {
		Respuesta re = new Respuesta();
		
		frame.getContentPane().removeAll();
		frame.setResizable(false);
		frame.repaint();
		frame.setTitle("Jenga Matematico - "+dif.DifText(Inicio.Dificultad));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(722, 324);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(ops.Seleccion(Inicio.Dificultad));
		lblNewLabel.setBounds(6, 116, 706, 48);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 43));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contesta la operacion");
		lblNewLabel_1.setBounds(10, 10, 702, 25);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(345, 205, 220, 85);

		// Agregar ActionListener para capturar el texto al presionar el botón
		Aceptar.addActionListener(e -> {
			re.Correcto();
			frame.dispose();
		});

		frame.getContentPane().add(Aceptar);
		
		JButton Salir = new JButton("Salir");
		Salir.setBounds(136, 205, 197, 85);
		frame.getContentPane().add(Salir);
		
		Salir.addActionListener(e -> {frame.dispose();Inicio.inicio();});
		

		frame.setVisible(true);
		
	}
	
}