package com.avatrixxyt.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;

public class Inicio {
	
	public static int Dificultad;
	
	static Jugando jugando = new Jugando();
	
	ButtonGroup group = new ButtonGroup();
	JFrame frame = new JFrame();
	private static final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void inicio() {
		JFrame frame = new JFrame("Yenga Matematico");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(446, 316);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Yenga Matematico");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 16, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 30, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 430, SpringLayout.WEST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Kailasa", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona Dificultad");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 149, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton Facil = new JRadioButton("Facil");
		springLayout.putConstraint(SpringLayout.NORTH, Facil, 19, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, Facil, 171, SpringLayout.WEST, frame.getContentPane());
		buttonGroup.add(Facil);
		Facil.setSelected(true);
		frame.getContentPane().add(Facil);
		
		JRadioButton Medio = new JRadioButton("Medio");
		springLayout.putConstraint(SpringLayout.NORTH, Medio, 3, SpringLayout.SOUTH, Facil);
		springLayout.putConstraint(SpringLayout.WEST, Medio, 171, SpringLayout.WEST, frame.getContentPane());
		buttonGroup.add(Medio);
		frame.getContentPane().add(Medio);
		
		JRadioButton Dificil = new JRadioButton("Dificil");
		springLayout.putConstraint(SpringLayout.NORTH, Dificil, 5, SpringLayout.SOUTH, Medio);
		springLayout.putConstraint(SpringLayout.WEST, Dificil, 171, SpringLayout.WEST, frame.getContentPane());
		buttonGroup.add(Dificil);
		frame.getContentPane().add(Dificil);
		
		JButton Jugar = new JButton("Jugar");
		springLayout.putConstraint(SpringLayout.WEST, Jugar, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, Jugar, -69, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(Jugar);

		// Acción para el botón Jugar
		Jugar.addActionListener(e -> {
			if (Facil.isSelected()) {
				Dificultad = 1;
				System.out.println("Dificultad: Fácil");
				frame.setVisible(false);
				jugando.jugando();
			} else if (Medio.isSelected()) {
				Dificultad = 2;
				System.out.println("Dificultad: Medio");
				frame.setVisible(false);
				jugando.jugando();
			} else if (Dificil.isSelected()) {
				Dificultad = 3;
				System.out.println("Dificultad: Difícil");
				frame.setVisible(false);
				jugando.jugando();
			}
			// Aquí puedes agregar más acciones según la dificultad seleccionada
		});

		JButton Salir = new JButton("Salir");
		springLayout.putConstraint(SpringLayout.NORTH, Salir, 0, SpringLayout.NORTH, Jugar);
		springLayout.putConstraint(SpringLayout.EAST, Salir, -44, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(Salir);

		// Acción para el botón Salir
		Salir.addActionListener(e -> frame.dispose());
		frame.setVisible(true);
		
	}
}