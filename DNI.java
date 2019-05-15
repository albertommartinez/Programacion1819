package ejercicio3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Pide un DNI y comprueba que es correcto, será correcto si 
 * tiene 9 caracteres y la letra es correcta.
 * @author Alberto Miguel Martinez Jimenez
 */
class DNI {
private static JFrame ventana;
	
	public static void main(String[] args) {
		
		//Ventana
		ventana = new JFrame("..::-DNI-::..");
		ventana.setBounds(100, 100, 350, 230);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		//Panel
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.CENTER);
		panel.setBounds(0, 0, 200, 230);
		ventana.getContentPane().add(panel);
		
		//Caja Texto numero
		JLabel lblNumero = new JLabel("Numero DNI");
		panel.add(lblNumero);
		JTextField tNumero = new JTextField();//instancia caja texto
		tNumero.setText("");
		tNumero.setColumns(10);
		tNumero.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tNumero);//incorpora caja de texto a la ventana
		
		//Caja Texto letra
		JLabel lblLetra = new JLabel("Letra DNI");
		panel.add(lblLetra);
		JTextField tLetra = new JTextField();//instancia caja texto
		tLetra.setText("");
		tLetra.setColumns(10);
		tLetra.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(tLetra);//incorpora caja de texto a la ventana
		
		//Resultado
		JLabel lblVerificacion = new JLabel("NO Verificado");
		lblVerificacion.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblVerificacion);
				
		//Boton
		JButton boton = new JButton("Verificar");//instancia boton 
		boton.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(boton);//incorpora boton a la ventana
		//Evento Boton
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoPulsar) {
				char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};						
				int  dni = Integer.parseInt(tNumero.getText());
				String sLetra = (tLetra.getText().toUpperCase());//transforma en mayusculas
				char letra = sLetra.charAt(0);//en caso de introducir mas de una letra cogera la primera
				int indice = dni%23;
				if(letras[indice]==letra) {
					lblVerificacion.setForeground(new Color(0,192,0));//Color texto -verde-
					lblVerificacion.setText("Valido");
				}else{
					lblVerificacion.setForeground(new Color(132,0,0));//Color texto -rojo-
					lblVerificacion.setText("No Valido");
				}	
			}
		});
				
		
		
		
		ventana.setVisible(true);//muestra ventana
	}
}
