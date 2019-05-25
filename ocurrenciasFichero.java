package ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class ocurrenciasFichero {

	private JFrame frame;
	private JTextField textField;
	private JTextField textPalabra;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ocurrenciasFichero window = new ocurrenciasFichero();
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
	public ocurrenciasFichero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 177);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(25);
		frame.getContentPane().add(panel);
		
		JLabel lblFicheroAComprobar = new JLabel("fichero a comprobar");
		panel.add(lblFicheroAComprobar);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPalabraABuscar = new JLabel("Palabra a buscar");
		panel.add(lblPalabraABuscar);
		
		textPalabra = new JTextField();
		panel.add(textPalabra);
		textPalabra.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//-------------------------------------------
				String fichero = null;
				try {
					BufferedReader br = new BufferedReader(new FileReader(fichero));
					String palabra = textPalabra.getText();
					String linea = null;
					int i = 0;
					int coincidencias = 0;
					
					while((linea=br.readLine())!=null) {
						while((linea.indexOf(palabra))!=-1) {
							linea = linea.substring(i+palabra.length(), linea.length());
							coincidencias++;
						}
					}
					br.close();
				
				}catch (Exception e2) {
					e2.printStackTrace();
				}
				//-------------------------------------------
			}
		});
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JLabel lblResultado = new JLabel("Resultado");
		panel_1.add(lblResultado);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
	}

}
