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

public class Jugando {
	
	SetDif dif = new SetDif();
	SelOP ops = new SelOP();
	
	ButtonGroup group = new ButtonGroup();
	JFrame frmHola = new JFrame();
	private JTextField txtRespuesta;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void jugando() {
		frmHola.setTitle("Yenga Matematico "+dif.DifText(Inicio.Dificultad));
		frmHola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHola.setSize(584, 242);
		SpringLayout springLayout = new SpringLayout();
		frmHola.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel(ops.Seleccion(Inicio.Dificultad));
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, frmHola.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 584, SpringLayout.WEST, frmHola.getContentPane());
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmHola.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contesta la operacion");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 29, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, frmHola.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 203, SpringLayout.WEST, frmHola.getContentPane());
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		frmHola.getContentPane().add(lblNewLabel_1);
		
		txtRespuesta = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtRespuesta, 10, SpringLayout.WEST, frmHola.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtRespuesta, -12, SpringLayout.SOUTH, frmHola.getContentPane());
		frmHola.getContentPane().add(txtRespuesta);
		txtRespuesta.setColumns(10);
		
		JButton Aceptar = new JButton("Aceptar");
		springLayout.putConstraint(SpringLayout.SOUTH, Aceptar, -9, SpringLayout.SOUTH, frmHola.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtRespuesta, -6, SpringLayout.WEST, Aceptar);
		springLayout.putConstraint(SpringLayout.EAST, Aceptar, -10, SpringLayout.EAST, frmHola.getContentPane());
		
		
		frmHola.getContentPane().add(Aceptar);
		frmHola.setVisible(true);
		
	}
}
