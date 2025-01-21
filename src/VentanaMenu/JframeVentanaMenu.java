package VentanaMenu;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import MetodosSueltos.Constantes;
import VentanaMenuVentitas.VentanaAñadir;

public class JframeVentanaMenu extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel panelFondo;
	private JButton botonAgregar;
	public JframeVentanaMenu() {
		setTitle("Menu (～￣▽￣)～");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		panelFondo=new JPanel();
		panelFondo.setBackground(Color.ORANGE);
		panelFondo.setLayout(null);
		this.getContentPane().add(panelFondo);
		componentes();
	}
	
	private void componentes() {
		botones();
	}
	
	private void botones() {
		botonAgregar=Constantes.boton("        add new",10,50,500,100,"Rockwell Extra Bold",30,Color.green);
		panelFondo.add(botonAgregar);
		ImageIcon imagen=new ImageIcon("C:/Users/HP/Documents/PROGRAMACION/Gestor De Tareas(Proyecto java)/Img/anadir.png"); // AGREGAMOS LA IMAGEN
		botonAgregar.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH)));
		
		botonAgregar.addActionListener(evento->{
			//new VentanaAñadir().setVisible(true);
		});
	}
}
