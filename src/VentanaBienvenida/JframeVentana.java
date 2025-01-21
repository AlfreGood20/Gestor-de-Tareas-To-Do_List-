package VentanaBienvenida;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import MetodosSueltos.Constantes;
import VentanaMenu.JframeVentanaMenu;

public class JframeVentana extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panelFondo;
	private JButton botonEntrar;
	
	public JframeVentana() {
		
		setTitle("Bienvenido ╰(*°▽°*)╯");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelFondo=new JPanel();
		panelFondo.setBackground(Color.red);
		panelFondo.setLayout(null); 
		this.getContentPane().add(panelFondo);
		componentes();
	}
	
	private void componentes() {
		botonEntrar();
		etiquetas();
	}
	
	private void botonEntrar() {
		botonEntrar=Constantes.boton("Iniciar ---->",850,480,250, 70,"Cooper Black",30,Color.MAGENTA);
		panelFondo.add(botonEntrar);
		
		botonEntrar.addActionListener(evento->{
			setVisible(false);
			new JframeVentanaMenu().setVisible(true);
		});
	}
	
	private void etiquetas() {
		JLabel etiquetaBienvenida = Constantes.etiqueta("<html><center>Bienvenido al Gestor de tareas<br>Haz click en Iniciar para comenzar a gestionar tus actividades</center></html>",
	            340, 0, 1050, 600, "Forte", 50, Color.ORANGE);
	    panelFondo.add(etiquetaBienvenida);
		
	    ImageIcon imagen = new ImageIcon("C:/Users/HP/Documents/PROGRAMACION/Gestor De Tareas(Proyecto java)/Img/ilustracionGestion.png");
        JLabel ilustracion = new JLabel();
        ilustracion.setBounds(-15,100,500,500);
        ilustracion.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(ilustracion.getWidth(), ilustracion.getHeight(), Image.SCALE_SMOOTH)));
        panelFondo.add(ilustracion);
	}
}
