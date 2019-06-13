package ej1;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ej1 {

	private JFrame frame;
	private JTextField txtOrigen;
	private JTextField txtDestino;
	private String textoSustituido;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1 window = new Ej1();
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
	public Ej1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int anchoPanel;
		int altoPanel;
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		frame.getContentPane().add(panel1, BorderLayout.NORTH);
		
		JLabel lblArchivoOrigen = new JLabel("Archivo Origen");
		panel1.add(lblArchivoOrigen);
		
		txtOrigen = new JTextField();
		panel1.add(txtOrigen);
		txtOrigen.setColumns(10);
		
		JButton btnOrigen = new JButton("OK");
		btnOrigen.addActionListener(new ActionListener() {
			private String texto = txtOrigen.getText();

			public void actionPerformed(ActionEvent arg0) {
				try {
					FileReader lector = new FileReader(texto);
					BufferedReader contenido = new BufferedReader(lector);
					while(contenido.readLine()!=null) {
						texto = contenido.readLine();
					}
				}catch(Exception e){
						texto = "Error de lectura";
				}
				//*******************************************
			}
		});
		panel1.add(btnOrigen);
		
		JLabel lblArchivoDestino = new JLabel("Archivo Destino");
		panel1.add(lblArchivoDestino);
		
		txtDestino = new JTextField();
		panel1.add(txtDestino);
		txtDestino.setColumns(10);
		
		JButton btnDestino = new JButton("OK");
		btnDestino.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				textoSustituido = null;
				try {
					File archivo = new File(txtDestino.getText());
					FileWriter escribir = new FileWriter(archivo,true);
					escribir.write(textoSustituido);
				}catch(Exception e2){
					System.out.println("Error de escritura");
				}
				//*******************************************
			}
		});
		panel1.add(btnDestino);
		
		JButton btnTranfor = new JButton("Sustituir");
		btnTranfor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//**Sustitucion******************************
				
				//*******************************************
			}
		});
		panel1.add(btnTranfor);
		
		JPanel panel2 = new JPanel();
		frame.getContentPane().add(panel2, BorderLayout.CENTER);
		
		anchoPanel = panel2.getWidth();
		altoPanel = panel2.getHeight();
		
		
		JTextArea txtArchivo = new JTextArea();
		txtArchivo.setRows(25);
		txtArchivo.setColumns(90);
		txtArchivo.setText("poney");
		panel2.add(txtArchivo);
		JScrollPane scrollPane = new JScrollPane(txtArchivo);
		panel2.add(scrollPane);
		
		
		
		
	}

}
