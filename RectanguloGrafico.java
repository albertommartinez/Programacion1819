package Ejercicios1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 *  Calcular el perímetro y área de un rectángulo dada su base y su altura.
 *	Componentes gráficos: 
 *
 *Etiquetas.
 *Cajas de texto para base y altura.
 *Botón para calcular.
 *Caja de texto resultado.
 * @author Alberto Miguel Martinez Jimenez
 */
class RectanguloGrafico {
	private static JFrame ventana;
	
	public static void main(String[] args) {
		
		ventana = new JFrame("..::Rectangulo::..");
		ventana.setBounds(100, 100, 150, 230);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.CENTER);
		panel.setBounds(0, 0, 150, 230);
		ventana.getContentPane().add(panel);
		
		//Caja Texto base
		JLabel lblBase = new JLabel("Base");
		panel.add(lblBase);
		JTextField Tbase = new JTextField();//instancia caja texto
		Tbase.setText("base");
		Tbase.setColumns(10);
		Tbase.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Tbase);//incorpora caja de texto a la ventana
		
		//Caja Texto altura
		JLabel lblAltura = new JLabel("Altura");
		panel.add(lblAltura);
		JTextField Taltura = new JTextField();//instancia caja texto
		Taltura.setText("altura");
		Taltura.setColumns(10);
		Taltura.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Taltura);//incorpora caja de texto a la ventana
				
		//Caja Texto perimetro
		JLabel lblPerimetro = new JLabel("Perimetro");
		panel.add(lblPerimetro);
		JTextField Tperimetro = new JTextField();//instancia caja texto
		Tperimetro.setText("perimetro");
		Tperimetro.setColumns(10);
		Tperimetro.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Tperimetro);//incorpora caja de texto a la ventana
		
		//Boton
		JButton Button = new JButton("Calcular");//instancia boton 
		Button.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(Button);//incorpora boton a la ventana
		//Evento Boton
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoPulsar) {
				double perimetro;
				double base;
				double altura;
				
				altura = Double.parseDouble(Taltura.getText());
				base = Double.parseDouble(Tbase.getText());
				perimetro = (base+altura)*2;
				
				Tperimetro.setText(String.valueOf(perimetro));
			}
		});
		
		
		ventana.setVisible(true);//muestra ventana
	}
}
