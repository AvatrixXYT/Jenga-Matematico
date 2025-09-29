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
	private JTextField txtRespuesta;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void jugando() {
		frame.getContentPane().removeAll();
		frame.setResizable(false);
		frame.repaint();
		frame.setTitle("Yenga Matematico - "+dif.DifText(Inicio.Dificultad));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(584, 242);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel(ops.Seleccion(Inicio.Dificultad));
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 584, SpringLayout.WEST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contesta la operacion");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 29, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 203, SpringLayout.WEST, frame.getContentPane());
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		txtRespuesta = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtRespuesta, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtRespuesta, -12, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(txtRespuesta);
		txtRespuesta.setColumns(10);
		
		JButton Aceptar = new JButton("Aceptar");
		springLayout.putConstraint(SpringLayout.SOUTH, Aceptar, -9, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtRespuesta, -6, SpringLayout.WEST, Aceptar);
		springLayout.putConstraint(SpringLayout.EAST, Aceptar, -10, SpringLayout.EAST, frame.getContentPane());

		// Agregar ActionListener para capturar el texto al presionar el botón
		Aceptar.addActionListener(e -> {
			int respuestaUsuario = 0;
			try {
				respuestaUsuario = Integer.parseInt(txtRespuesta.getText());
				Check(respuestaUsuario);
				// Aquí puedes usar la variable respuestaUsuario como desees
			} catch (NumberFormatException ex) {
				// Manejar el caso en que el campo esté vacío o no sea un número válido
				System.out.println("Por favor ingresa un número válido.");
			}
		});

		frame.getContentPane().add(Aceptar);
		
		JButton Salir = new JButton("Salir");
		springLayout.putConstraint(SpringLayout.NORTH, Salir, 0, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, Salir, 0, SpringLayout.WEST, txtRespuesta);
		frame.getContentPane().add(Salir);
		
		Salir.addActionListener(e -> {frame.dispose();Inicio.inicio();});
		
		// Crear un DocumentFilter para permitir solo números (ahora también negativos)
		DocumentFilter soloNumerosFilter = new DocumentFilter() {
			@Override
			public void insertString(FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attr) throws javax.swing.text.BadLocationException {
				StringBuilder sb = new StringBuilder(txtRespuesta.getText());
				sb.insert(offset, string);
				if (sb.toString().matches("-?\\d*")) {
					super.insertString(fb, offset, string, attr);
				}
			}
			@Override
			public void replace(FilterBypass fb, int offset, int length, String text, javax.swing.text.AttributeSet attrs) throws javax.swing.text.BadLocationException {
				StringBuilder sb = new StringBuilder(txtRespuesta.getText());
				sb.replace(offset, offset + length, text);
				if (sb.toString().matches("-?\\d*")) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		};
		((AbstractDocument) txtRespuesta.getDocument()).setDocumentFilter(soloNumerosFilter);

		frame.setVisible(true);
		
	}
	
	public void Check(int respuestaUsuario) {
		// Suponiendo que aquí se verifica la respuesta
		boolean esCorrecto = respuestaUsuario == ops.RespuestaCO;
		Respuesta respuesta = new Respuesta();
		respuesta.GUICheck(esCorrecto);
		frame.dispose();
	}
}