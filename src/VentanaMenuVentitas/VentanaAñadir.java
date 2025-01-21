package VentanaMenuVentitas;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MetodosSueltos.Constantes;
import VentanaBienvenida.JframeVentana;

public class VentanaAñadir extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField nombre;
	private JTextField descripcion;
	private JTextField fecha;
	
	public VentanaAñadir() {
		setTitle("Añadiendo tarea");
		setSize(500,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		panel=new JPanel();
		panel.setBackground(Color.cyan);
		panel.setLayout(null);
		this.getContentPane().add(panel);
		componentes();
	}
	
	private void componentes() {
		campos();
	}
	
	private void campos() {
		nombre=Constantes.campo("Nombre Actividad....",50,50,300,100,"Arial",45,Color.BLACK);
		panel.add(nombre);
	}
	
	public static void main(String[] args) {
		new VentanaAñadir().setVisible(true);
	}
}
