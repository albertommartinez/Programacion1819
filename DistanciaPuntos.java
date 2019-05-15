package Ejercicio2;
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
 * Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos 
 * en el plano. Calcula y muestra la distancia entre ellos.
 * @author Alberto Miguel Martinez Jimenez
 */
class DistanciaPuntos {
	private static JFrame ventana;
	
	public static void main(String[] args) {
		ventana = new JFrame("..::Distancia entre puntos::..");
		ventana.setBounds(300, 300, 150, 330);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.CENTER);
		panel.setBounds(0, 0, 150, 330);
		ventana.getContentPane().add(panel);
		
		//Caja Texto x1
		JLabel lblx1 = new JLabel("Punto X1");
		panel.add(lblx1);
		JTextField Tx1 = new JTextField();//instancia caja texto
		Tx1.setText("");
		Tx1.setColumns(10);
		Tx1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Tx1);//incorpora caja de texto a la ventana
		
		//Caja Texto y1
		JLabel lbly1 = new JLabel("Punto Y1");
		panel.add(lbly1);
		JTextField Ty1 = new JTextField();//instancia caja texto
		Ty1.setText("");
		Ty1.setColumns(10);
		Ty1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Ty1);//incorpora caja de texto a la ventana
		
		//Caja Texto x2
		JLabel lblx2 = new JLabel("Punto X2");
		panel.add(lblx2);
		JTextField Tx2 = new JTextField();//instancia caja texto
		Tx2.setText("");
		Tx2.setColumns(10);
		Tx2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Tx2);//incorpora caja de texto a la ventana
		
		//Caja Texto y2
		JLabel lbly2 = new JLabel("Punto Y2");
		panel.add(lbly2);
		JTextField Ty2 = new JTextField();//instancia caja texto
		Ty2.setText("");
		Ty2.setColumns(10);
		Ty2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Ty2);//incorpora caja de texto a la ventana
		
		//Caja Texto distancia
		JLabel lblD = new JLabel("Distancia");
		panel.add(lblD);
		JTextField Td = new JTextField();//instancia caja texto
		Td.setText("");
		Td.setColumns(10);
		Td.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Td);//incorpora caja de texto a la ventana
		
		//Boton
		JButton boton = new JButton("Calcular");//instancia boton 
		boton.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(boton);//incorpora boton a la ventana
		//Evento Boton
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoPulsar) {
				//Accion del boton
				double x1;
				double x2;
				double y1;
				double y2;
				double distancia = 0;
				try {
					x1 = Double.parseDouble(Tx1.getText());
					y1 = Double.parseDouble(Ty1.getText());
					x2 = Double.parseDouble(Tx2.getText());
					y2 = Double.parseDouble(Ty2.getText());
					distancia = Math.sqrt(Math.pow(x2-x1,2)-Math.pow(y2-y1,2));
					Td.setText(String.valueOf(distancia));
				}catch(Exception e){
					Td.setText("Entrada/s erroneas");
				}
				//-----------------
			}
		});
		ventana.setVisible(true);//muestra ventana
	}
}
