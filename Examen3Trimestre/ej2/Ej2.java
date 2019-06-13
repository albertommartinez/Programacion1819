package ej2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej2 {

	private JFrame frame;
	private JTextField textFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2 window = new Ej2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ej2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 858, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton botonDiaAntes = new JButton("Dia Anterior");
		botonDiaAntes.setEnabled(false);
		panel.add(botonDiaAntes);
		
		textFecha = new JTextField();
		panel.add(textFecha);
		textFecha.setColumns(10);
		
		JButton botonDiaDespues = new JButton("Dia Siguiente");
		botonDiaDespues.setEnabled(false);
		panel.add(botonDiaDespues);
		
		JButton botonDiasHastaHoy = new JButton("Dias hasta Hoy");
		botonDiasHastaHoy.setEnabled(false);
		panel.add(botonDiasHastaHoy);
		
		JButton botonValidar = new JButton("Validar Fecha");
		botonValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Fecha.esFechaValida(textFecha.getText())) {
					botonDiaAntes.setEnabled(true);
					botonDiaDespues.setEnabled(true);
					botonDiasHastaHoy.setEnabled(true);
				}
			}
		});
		panel.add(botonValidar);
		
		JButton btnNewButton = new JButton("Terminar");
		panel.add(btnNewButton);
		
		
	}
	
	

}
