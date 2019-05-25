package ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MezclarArchivosTexto {

	private JFrame frame;
	private JTextField txtFicheroOrigen;
	private JTextField txtFicheroDos;
	private JPanel panel_1;
	private JButton btnMezclar;
	private JTextArea txtContenido;
	private ArrayList<String> fich1 = new ArrayList<String>();
	private ArrayList<String> fich2 = new ArrayList<String>();
	private ArrayList<String> fich3 = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MezclarArchivosTexto window = new MezclarArchivosTexto();
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
	public MezclarArchivosTexto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 739, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtFicheroOrigen = new JTextField();
		txtFicheroOrigen.setText("Fichero Uno");
		panel.add(txtFicheroOrigen);
		txtFicheroOrigen.setColumns(10);
		
		txtFicheroDos = new JTextField();
		txtFicheroDos.setText("Fichero Dos");
		panel.add(txtFicheroDos);
		txtFicheroDos.setColumns(10);
		
		btnMezclar = new JButton("Mezclar");
		btnMezclar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//-------------------	
				ArrayList fich1 = new ArrayList();//contenido en lineas fichero1
				ArrayList fich2 = new ArrayList();//contenido en lineas fichero2
				ArrayList fich3 = new ArrayList();//contenido en lineas fichero resultado
				
				
			//-------------------
			}
		});
		panel.add(btnMezclar);
		
		panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(40);
		flowLayout.setHgap(300);
		frame.getContentPane().add(panel_1);
		
		txtContenido = new JTextArea();
		txtContenido.setLineWrap(true);
		txtContenido.setColumns(80);
		txtContenido.setRows(20);
		txtContenido.setText("Contenido");
		panel_1.add(txtContenido);
	}
/**
 * devuelve True si el fichero pasado 
 * por parametro existe, False en caso contrario
 * @param fichero String
 * @return boolean
 */
	public boolean existeFichero(String fichero) {
		File archivo = new File(fichero);
		BufferedWriter bw;
		if(archivo.exists()) {
			return true;
		}else{
			return false;
		}
	}
	
	/**
 * lee de un fichero de texto
 * y escribe en el fichero correspondiente
 * @param archivo String
 */
	public void leerEscribeFicheroTexto(String archivo1,String archivo2,String archivoResultado){
		File f1 = new File(archivo1);
		BufferedReader entrada1;
		entrada1 = null;
		
		File f2 = new File(archivo2);
		BufferedReader entrada2;
		entrada2 = null;
		
		
		try {
			entrada1 = new BufferedReader(new FileReader(f1));
			entrada2 = new BufferedReader(new FileReader(f2));
			String linea;
			int n = 0;
			while((entrada1.ready())&&(entrada1.ready())) {
				linea = entrada1.readLine();
				escribirTexto(archivoResultado,linea);
				linea = entrada2.readLine();
				escribirTexto(archivoResultado,linea);
				n++;
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try {
				entrada1.close();
				entrada2.close();
			}catch(IOException e1){
				
			}
		}
		
	}
/**
 * lee un fichero de texto 	
 * @param archivo String
 */
	public String leeLineaFicheroTexto(String archivo) {
		File f = new File(archivo);
		BufferedReader entrada;
		String linea = null;
		entrada = null;
		try {
			entrada = new BufferedReader(new FileReader(f));
			if(entrada.ready()) {
				linea = entrada.readLine();
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try {
				entrada.close();
				return linea;
			}catch(IOException e1){
				e1.printStackTrace();
			}
		}
		return linea;
	}
/**
 * escribe en un fichero de texto plano
 * la linea pasada por parametro
 * @param archivo String
 * @param linea String
 * @throws IOException 
 */
	public void escribirTexto(String archivo,String linea) throws IOException {
		File file = new File(archivo);
		BufferedWriter bw = null;
		
		try {
			if(!existeFichero(archivo)) {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(linea+"\n");
			}else{
				bw.write(linea+"\n");
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			bw.close();
		}
	}

	public void mezclarFicheros(String archivo1,String archivo2,String archivoResultado) {
		leerEscribeFicheroTexto(archivo1,archivo2,archivoResultado);
		
		try {
			while(true) {
				txtContenido.append(leeLineaFicheroTexto(archivoResultado));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

}
