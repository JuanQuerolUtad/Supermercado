package casosupuestojuanquerol;

public class Producto {
	private String nombre;
	private double precio;
	private Secciones seccion;
	private int stock;
	
	public Producto(String nombre, double precio,Secciones seccion, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.seccion=seccion;
		this.stock=stock;
	}
	
	

	public Secciones getSeccion() {
		return seccion;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
