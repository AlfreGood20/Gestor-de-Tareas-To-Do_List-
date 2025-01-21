package MetodosSueltos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class Constantes extends JPanel {
    private static final long serialVersionUID = 1L;

    private Image imagen;
    
    public Constantes(String rutaImagen) {
        try {
            imagen = ImageIO.read(new File(rutaImagen));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
    
    public static JButton boton(String nombre,int x,int y,int largo,int ancho,String tipoLetra,int tamaño,Color color) {
    	JButton boton=new JButton(nombre);
    	boton.setBounds(x, y, largo, ancho);
    	boton.setFont(new Font(tipoLetra,Font.BOLD,tamaño));
    	boton.setBackground(color);
    	return boton;
    }
    
    public static JLabel etiqueta(String nombre,int x,int y,int largo,int ancho,String tipoLetra,int tamaño,Color color ) {
    	JLabel etiqueta=new JLabel(nombre);
    	etiqueta.setBounds(x, y, largo, ancho);
    	etiqueta.setForeground(color);
    	etiqueta.setFont(new Font(tipoLetra, Font.BOLD,tamaño));
    	return etiqueta;
    }
    
    public static JTextField campo(String texto,int x,int y,int largo,int ancho,String tipoletra,int tamaño,Color color) {
    	JTextField campo=new JTextField(texto);
    	campo.setBounds(x, y,largo,ancho);
    	campo.setForeground(color);
    	return campo;
    }
}
