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
	static ReglasYAyuda reglas = new ReglasYAyuda();
	
	ButtonGroup group = new ButtonGroup();
	JFrame frame = new JFrame();
	private static final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void inicio() {
		JFrame frame = new JFrame("Yenga Matematico");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(612, 273);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Yenga Matematico");
		lblNewLabel.setBounds(10, 10, 592, 31);
		lblNewLabel.setFont(new Font("Kailasa", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona Dificultad");
		lblNewLabel_1.setBounds(10, 51, 592, 20);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton Facil = new JRadioButton("Facil");
		Facil.setBounds(270, 86, 68, 25);
		Facil.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		buttonGroup.add(Facil);
		Facil.setSelected(true);
		frame.getContentPane().add(Facil);
		
		JRadioButton Medio = new JRadioButton("Medio");
		Medio.setBounds(267, 114, 80, 25);
		Medio.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		buttonGroup.add(Medio);
		frame.getContentPane().add(Medio);
		
		JRadioButton Dificil = new JRadioButton("Dificil");
		Dificil.setBounds(269, 144, 78, 25);
		Dificil.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		buttonGroup.add(Dificil);
		frame.getContentPane().add(Dificil);
		
		JButton Jugar = new JButton("Jugar");
		Jugar.setBounds(10, 176, 149, 61);
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
		Salir.setBounds(465, 176, 137, 61);
		frame.getContentPane().add(Salir);
		
		JButton Ruls = new JButton("Reglas y ayuda");
		Ruls.setBounds(165, 175, 294, 62);
		frame.getContentPane().add(Ruls);
		
		Ruls.addActionListener(e -> {
			reglas.reglas();
		});

		// Acción para el botón Salir
		Salir.addActionListener(e -> frame.dispose());
		frame.setVisible(true);
		
	}
}