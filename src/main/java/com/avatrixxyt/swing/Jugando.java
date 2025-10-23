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
		frame.setSize(722, 324);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(ops.Seleccion(Inicio.Dificultad));
		lblNewLabel.setBounds(10, 116, 712, 48);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 43));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contesta la operacion");
		lblNewLabel_1.setBounds(91, 10, 621, 25);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		txtRespuesta = new JTextField();
		txtRespuesta.setBounds(10, 258, 604, 26);
		frame.getContentPane().add(txtRespuesta);
		txtRespuesta.setColumns(10);
		
		JButton Aceptar = new JButton("Aceptar");
		Aceptar.setBounds(620, 258, 92, 29);

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
		Salir.setBounds(10, 10, 75, 29);
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