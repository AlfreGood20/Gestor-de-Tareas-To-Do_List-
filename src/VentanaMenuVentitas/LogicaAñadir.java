package VentanaMenuVentitas;

public class LogicaAñadir {
	private String nombreActividad;
	private String descripcion;
	private String fecha;
	private boolean estado;
	
	public LogicaAñadir(String nombreActividad, String descripcion,String fecha) {
		this.nombreActividad = nombreActividad;
		this.descripcion = descripcion;
		this.fecha=fecha;
		this.estado = false;
	}
	
}
