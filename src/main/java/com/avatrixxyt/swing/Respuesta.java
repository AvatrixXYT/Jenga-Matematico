package com.avatrixxyt.swing;

import javax.swing.JFrame;
import com.avatrixxyt.logic.SelOP;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Respuesta {
	
	Jugando jug = new Jugando();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void Correcto() {
		SelOP CO = new SelOP();
		
		JFrame frame = new JFrame("Respuesta Correcta");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(584, 242);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Respuesta:");
		lblNewLabel.setBounds(157, 10, 261, 53);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Sig = new JButton("Siguiente operacion");
		Sig.setBounds(286, 136, 292, 72);
		frame.getContentPane().add(Sig);
		Sig.addActionListener(e -> {frame.setVisible(false);jug.jugando();});
		
		JButton Salir = new JButton("Salir");
		Salir.setBounds(6, 136, 275, 72);
		frame.getContentPane().add(Salir);
		Salir.addActionListener(e -> {
			
		});
		
		JLabel lblNewLabel_1 = new JLabel(""+CO.RespuestaCO);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(219, 75, 154, 49);
		frame.getContentPane().add(lblNewLabel_1);
		Salir.addActionListener(e -> {frame.setVisible(false);Inicio.inicio();});
		
		frame.setVisible(true);
	}
}
